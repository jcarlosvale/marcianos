package com.marcianos.learning.entidades;

/*
String nome
String username
String cpf/cnpj
String senha
String email
Conta contas [];

POJO
 */

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

//@RequiredArgsConstructor
@RequiredArgsConstructor
@Data
public class Usuario {

    private final String nome;
    private final String cpf;
    private final String email;
    private final List<Conta> contaList;

    public static void main(String[] args) {
        var usuario = new Usuario("nome", "cpf", "email", List.of());

    }
}
