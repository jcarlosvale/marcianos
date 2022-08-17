package com.marcianos.learning.api.service.implementation;

import com.marcianos.learning.api.entidade.Agencia;
import com.marcianos.learning.api.entidade.ContaBancaria;
import com.marcianos.learning.api.entidade.Pessoa;
import com.marcianos.learning.api.exception.ContaNotFoundException;
import com.marcianos.learning.api.service.ContaBancariaService;
import com.marcianos.learning.api.service.implementation.sort.OrdenarTitular;
import com.marcianos.learning.api.service.implementation.sort.OrdenarValor;

import java.math.BigDecimal;
import java.util.*;

public class ContaBancariaServiceInMemory implements ContaBancariaService {

    private final Set<ContaBancaria> listaContasBancarias = new HashSet<>();
    private final Set<Pessoa> conjuntoPessoas = new HashSet<>(); // Não é preciso repetir o tipo de dado
    private int idConta = 1;

    @Override
    public ContaBancaria cadastrarConta(final Agencia agencia, final Pessoa pessoa) {

        checkNotNull(agencia, "Agencia não pode ser null");
        checkNotNull(pessoa, "Pessoa não pode ser null");
        verificarPessoaNaoPossuiConta(pessoa);

        ContaBancaria contaBancaria = new ContaBancaria(pessoa, agencia, idConta++, BigDecimal.ZERO);
        listaContasBancarias.add(contaBancaria);
        conjuntoPessoas.add(pessoa);

        return contaBancaria;

    }

    @Override
    public ContaBancaria creditar(final ContaBancaria conta,final BigDecimal valor) {
        checkNotNull(conta, "Conta nao deve ser nula");
        checkNotNull(valor, "Valor nao deve ser nula");
        validarValorPositivo(valor);
        validarConta(conta);

        ContaBancaria novaConta =
                new ContaBancaria(  conta.getTitular(),
                                    conta.getAgencia(),
                                    conta.getConta(),
                                    conta.getSaldo().add(valor));

        listaContasBancarias.remove(conta);
        listaContasBancarias.add(novaConta);
        
        return novaConta;
    }

    private void validarValorPositivo(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("Não é possível creditar valor menor que zero");
        }
    }

    private void validarConta(ContaBancaria conta) {

        if(!listaContasBancarias.contains(conta)){
            throw new ContaNotFoundException();
        }
    }

    @Override
    public ContaBancaria debitar(final ContaBancaria conta, final BigDecimal valor) {
        checkNotNull(conta, "Conta nao deve ser nula");
        checkNotNull(valor, "Valor nao deve ser nula");
        validarValorPositivo(valor);
        validarConta(conta);
        verificarSaldoSuficiente(valor, conta.getSaldo());

        final ContaBancaria novaConta =
                new ContaBancaria(  conta.getTitular(),
                        conta.getAgencia(),
                        conta.getConta(),
                        conta.getSaldo().subtract(valor));

        listaContasBancarias.remove(conta);
        listaContasBancarias.add(novaConta);

        return novaConta;
    }

    private void verificarSaldoSuficiente(BigDecimal valor, BigDecimal saldo) {
        if(saldo.compareTo(valor) < 0){
            throw new RuntimeException("Saldo Insuficiente ara debito");

        }
    }

    @Override
    public void removerConta(ContaBancaria conta) {
        checkNotNull(conta, "Conta nao deve ser nula");
        validarConta(conta);
        listaContasBancarias.remove(conta);
        conjuntoPessoas.remove(conta.getTitular());

    }

    @Override
    public List<ContaBancaria> listarContasPorValor() {
        List<ContaBancaria> lista = new ArrayList<>(listaContasBancarias);
        var ordenarPorValor = new OrdenarValor();
        lista.sort(ordenarPorValor);

        return lista;

    }

    @Override
    public List<ContaBancaria> listarContasPorPessoa() {

        List<ContaBancaria> lista = new ArrayList<>(listaContasBancarias);
        var ordenarPorTitular = new OrdenarTitular();
        lista.sort(ordenarPorTitular);

        return lista;
    }

    @Override
    public List<ContaBancaria> listarContasPorCodigo() {
        List<ContaBancaria> lista = new ArrayList<>(listaContasBancarias);
        Collections.sort(lista);

        return lista;
    }

    private void verificarPessoaNaoPossuiConta(Pessoa pessoa) {
        if(conjuntoPessoas.contains(pessoa)){
            throw new RuntimeException("Pessoa ja possui conta na agencia");
        }
    }

    private void checkNotNull(Object object, String mensagem) {
        if(Objects.isNull(object)){
            throw new RuntimeException(mensagem);
        }
    }

}
