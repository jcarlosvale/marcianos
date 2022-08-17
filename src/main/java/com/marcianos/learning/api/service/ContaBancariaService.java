package com.marcianos.learning.api.service;

import com.marcianos.learning.api.entidade.Agencia;
import com.marcianos.learning.api.entidade.ContaBancaria;
import com.marcianos.learning.api.entidade.Pessoa;

import java.math.BigDecimal;
import java.util.List;

public interface ContaBancariaService {

    ContaBancaria cadastrarConta(Agencia agencia, Pessoa pessoa);
    ContaBancaria creditar(ContaBancaria conta, BigDecimal valor);
    ContaBancaria debitar(ContaBancaria conta, BigDecimal valor);
    void removerConta(ContaBancaria conta);
    List<ContaBancaria> listarContasPorValor();
    List<ContaBancaria> listarContasPorPessoa();
    List<ContaBancaria> listarContasPorCodigo();


}
