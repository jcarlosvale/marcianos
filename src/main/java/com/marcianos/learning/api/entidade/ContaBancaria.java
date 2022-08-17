package com.marcianos.learning.api.entidade;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaBancaria implements Comparable<ContaBancaria>{

    private final Pessoa titular;
    private final Agencia agencia;
    private final int conta;
    private final BigDecimal saldo;

    public ContaBancaria(Pessoa titular, Agencia agencia, int conta, BigDecimal saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return conta == that.conta && Objects.equals(titular, that.titular) && Objects.equals(agencia, that.agencia) && Objects.equals(saldo, that.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, agencia, conta, saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public int compareTo(ContaBancaria o) {
        return this.conta - o.conta;
    }
}
