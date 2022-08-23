package com.marcianos.learning.api.service.implementation;

import com.marcianos.learning.api.entidade.Agencia;
import com.marcianos.learning.api.entidade.ContaBancaria;
import com.marcianos.learning.api.entidade.Pessoa;
import com.marcianos.learning.api.service.ContaBancariaService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountBancariaServiceInMemoryTest {

    @Test
    void cadastrarConta() {
        //GIVEN
        ContaBancariaService service = new ContaBancariaServiceInMemory();
        Agencia agencia = new Agencia("001","3598");
        Pessoa pessoa = new Pessoa("Renan Valadares", "654897925");
        var expected = new ContaBancaria(pessoa, agencia, 1, BigDecimal.ZERO);
        //WHEN
        var actual = service.cadastrarConta(agencia, pessoa);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void validarContador() {
        //GIVEN
        ContaBancariaService service = new ContaBancariaServiceInMemory();
        Agencia agencia = new Agencia("001","3598");
        Pessoa pessoa = new Pessoa("Renan Valadares", "654897925");
        Pessoa pessoa2 = new Pessoa("Luiza", "654897925");
        var expected = new ContaBancaria(pessoa2, agencia, 2, BigDecimal.ZERO);
        service.cadastrarConta(agencia, pessoa);
        //WHEN
        var actual = service.cadastrarConta(agencia, pessoa2);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    //TODO: debitar com valor zerado
    //TODO: debitar com valor maior que o saldo
    //TODO: debitar com valor inferior ao saldo
    //TODO: creditar com valor zerado, verificando a exceção
    //TODO: creditar com sucesso
    //TODO: verificar os listar(valor, titular e codigo)

    @Test
    void creditar() {
    }

    @Test
    void debitar() {
    }

    @Test
    void removerConta() {
    }

    @Test
    void listarContasPorValor() {
    }

    @Test
    void listarContasPorPessoa() {
    }

    @Test
    void listarContasPorCodigo() {
    }
}