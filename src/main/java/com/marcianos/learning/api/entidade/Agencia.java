package com.marcianos.learning.api.entidade;

import java.util.Objects;

public class Agencia {

    private final String nome;
    private final String codigo;

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Agencia(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agencia agencia = (Agencia) o; //cast
        return Objects.equals(nome, agencia.nome) && Objects.equals(codigo, agencia.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo);
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
