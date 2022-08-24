package com.marcianos.learning.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/*
numeroDaConta: Integer
banco : Banco
pais : Pais
saldo : BigDecimal
titular : Usuario
dataCadastro: LocalDateTime
 */
@Data
@AllArgsConstructor
public abstract class BankAccount implements Entity{

    private int id;
    private Bank bank;
    private Country country;
    private BigDecimal balance;

    private Currency currency;
    private User user;
    private LocalDateTime activationDate;

}
