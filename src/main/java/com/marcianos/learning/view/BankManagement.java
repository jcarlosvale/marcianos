package com.marcianos.learning.view;

import java.util.Scanner;

public class BankManagement {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        var operation = OperacaoMenuPrincipal.UNKNOWN;

        while (!operation.equals(OperacaoMenuPrincipal.SAIR)) {
            System.out.println();
            System.out.println("************ GERENCIADOR DE CONTAS TABAJARA ************");
            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - USUARIO");
            System.out.println("2 - CONTAS");
            System.out.println("3 - OPERACOES");
            System.out.println("9 - SAIR");
            System.out.print(">>> ");
            operation = readOperacaoMenuPrincipalFromKeyboard();
            processMenuPrincipalOperation(operation);
        }
    }

    private static void menuOperacoes() {
        var operation = Operacoes.UNKNOWN;

        while (operation.equals(Operacoes.UNKNOWN)) {
            System.out.println("########## OPERACOES ##########");
            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - CREDITAR CONTA");
            System.out.println("2 - DEBITAR CONTA");
            System.out.println("3 - EXTRAT CONTA");
            System.out.println("4 - TRANSFERIR ENTRE CONTAS");
            System.out.println("5 - CONSULTAR DATA HORA");
            System.out.println("6 - CONSULTAR COTACAO");
            System.out.println("9 - SAIR");
            System.out.print(">>> ");
            operation = readOperacaoMenuOperacoesFromKeyboard();
        }

        processMenuOperacoesOperation(operation);
    }

    private static void processMenuPrincipalOperation(OperacaoMenuPrincipal operation) {
        System.out.println();
        switch (operation) {
            case USUARIO:
                menuUsuario();
                break;
            case CONTAS:
                menuContas();
                break;
            case OPERACOES:
                menuOperacoes();
                break;
            case SAIR:
                System.out.println("ATE LOGO!");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
        }
    }

    private static void menuUsuario() {
        var operation = OperacaoUsuario.UNKNOWN;

        while (operation.equals(OperacaoUsuario.UNKNOWN)) {
            System.out.println("########## USUARIO ##########");
            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - INFORMACOES");
            System.out.println("2 - EDITAR");
            System.out.println("9 - SAIR");
            System.out.print(">>> ");
            operation = readOperacaoUsuarioFromKeyboard();
        }

        processMenuUsuarioOperation(operation);
    }
    private static void menuContas() {
        var operation = OperacaoMenuContas.UNKNOWN;

        while (operation.equals(OperacaoMenuContas.UNKNOWN)) {
            System.out.println("########## CONTAS ##########");
            System.out.println("DIGITE A OPCAO DESEJADA: ");
            System.out.println("1 - LISTAR");
            System.out.println("2 - CADASTRAR");
            System.out.println("3 - EDITAR");
            System.out.println("4 - REMOVER");
            System.out.println("9 - SAIR");
            System.out.print(">>> ");
            operation = readOperacaoMenuContasFromKeyboard();
        }

        processMenuContasOperation(operation);
    }

    private static void processMenuOperacoesOperation(Operacoes operation) {
        System.out.println();
        switch (operation) {
            case CREDITAR_CONTA:
                System.out.println("CREDITAR CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case DEBITAR_CONTA:
                System.out.println("DEBITAR CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case EXTRATO_CONTA:
                System.out.println("EXTRATO DE CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");                scanner.nextLine();
                scanner.nextLine();
                break;
            case TRANSFERIR_ENTRE_CONTAS:
                System.out.println("TRANSFERENCIA ENTRE CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case CONSULTAR_DATA_HORA:
                System.out.println("CONSULTAR DATA E HORA EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case CONSULTAR_COTACAO:
                System.out.println("CONSULTAR COTACAO EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
        }
    }

    private static OperacaoMenuPrincipal readOperacaoMenuPrincipalFromKeyboard() {
        var option = scanner.nextLine();
        var operation = OperacaoMenuPrincipal.retrieveOperation(option);
        if (operation.equals(OperacaoMenuPrincipal.UNKNOWN)) {
            menuOpcaoInvalida();
        }
        return operation;
    }

    private static OperacaoUsuario readOperacaoUsuarioFromKeyboard() {
        var option = scanner.nextLine();
        var operation = OperacaoUsuario.retrieveOperation(option);
        if (operation.equals(OperacaoUsuario.UNKNOWN)) {
            menuOpcaoInvalida();
        }
        return operation;
    }

    private static OperacaoMenuContas readOperacaoMenuContasFromKeyboard() {
        var option = scanner.nextLine();
        var operation = OperacaoMenuContas.retrieveOperation(option);
        if (operation.equals(OperacaoMenuContas.UNKNOWN)) {
            menuOpcaoInvalida();
        }
        return operation;
    }

    private static Operacoes readOperacaoMenuOperacoesFromKeyboard() {
        var option = scanner.nextLine();
        var operation = Operacoes.retrieveOperation(option);
        if (operation.equals(Operacoes.UNKNOWN)) {
            menuOpcaoInvalida();
        }
        return operation;
    }

    private static void processMenuContasOperation(OperacaoMenuContas operation) {
        System.out.println();
        switch (operation) {
            case LISTAR:
                System.out.println("LISTAR CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case CADASTRAR:
                System.out.println("CADASTRAR CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case EDITAR:
                System.out.println("EDITAR CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case REMOVER:
                System.out.println("REMOVER CONTAS EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
        }
    }

    private static void processMenuUsuarioOperation(OperacaoUsuario operation) {
        System.out.println();
        switch (operation) {
            case LISTAR_INFORMACOES:
                System.out.println("LISTAR INFORMACOES EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
            case EDITAR_INFORMACOES:
                System.out.println("EDITAR INFORMACOES EM BREVE");
                System.out.println("Pressione qualquer tecla para continuar ...");
                scanner.nextLine();
                break;
        }
    }

    private static void menuOpcaoInvalida() {
        System.out.println("Operacao invalida!!");
        System.out.println("Pressione qualquer tecla para continuar ...");
        scanner.nextLine();
    }

}
