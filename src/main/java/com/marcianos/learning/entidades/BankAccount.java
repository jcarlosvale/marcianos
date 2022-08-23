package com.marcianos.learning.entidades;

import lombok.Data;
import lombok.NonNull;

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
public abstract class BankAccount implements Entity{

    private final int id;
    private final Bank bank;
    private final Country country;
    private final BigDecimal balance;

    private final Currency currency;
    private final User user;
    private final LocalDateTime activationDate;

    public BankAccount(int id, @NonNull Bank bank, @NonNull Country country,
                       @NonNull BigDecimal balance, Currency currency, @NonNull User user,
                       @NonNull LocalDateTime activationDate) {
        this.id = id;
        this.bank = bank;
        this.country = country;
        this.balance = balance;
        this.currency = currency;
        this.user = user;
        this.activationDate = activationDate;
    }
}
