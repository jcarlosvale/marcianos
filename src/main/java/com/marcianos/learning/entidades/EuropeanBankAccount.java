package com.marcianos.learning.entidades;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
public class EuropeanBankAccount extends BankAccount{

    private String iban;

    public EuropeanBankAccount(int id, @NonNull Bank bank, @NonNull Country country, @NonNull BigDecimal balance,
                               Currency currency, @NonNull User user, @NonNull LocalDateTime activationDate,
                               String iban) {
        super(id, bank, country, balance, currency, user, activationDate);
        this.iban = iban;
    }

    @Override
    public void validate() throws Exception {

    }
}
