package com.marcianos.learning.classes;

public class SRH {

    public static void main(String[] args) {
        var joao = new FuncionarioModerno("Joao", "F123", "Brasileiro");
        var lucas = new FuncionarioModerno("Lucas", "F123", "Brasileiro");
        var luiza = new Funcionario("Luiza", "F123", "Brasileira");

        System.out.println(joao);
        System.out.println(joao.matricula());
    }
}
