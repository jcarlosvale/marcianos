package com.marcianos.learning.classes;

import java.util.Objects;

public final class Funcionario {

    private final String nome;
    private final String matricula;
    private final String nacionalidade;

    public Funcionario(String nome, String matricula, String nacionalidade) {
        this.nome = nome;
        this.matricula = matricula;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(nome, that.nome) && Objects.equals(matricula, that.matricula) && Objects.equals(nacionalidade, that.nacionalidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula, nacionalidade);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
