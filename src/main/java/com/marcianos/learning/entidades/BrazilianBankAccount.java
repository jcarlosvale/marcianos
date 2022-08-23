package com.marcianos.learning.entidades;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
public class BrazilianBankAccount extends BankAccount {

    private final String agencyNumber;
    private final int accountNumber;

    public BrazilianBankAccount(int id, @NonNull Bank bank, @NonNull Country country, @NonNull BigDecimal balance,
                                Currency currency, @NonNull User user, @NonNull LocalDateTime activationDate,
                                String agencyNumber, int accountNumber) {
        super(id, bank, country, balance, currency, user, activationDate);
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
    }

    @Override
    public void validate() {

    }
}
