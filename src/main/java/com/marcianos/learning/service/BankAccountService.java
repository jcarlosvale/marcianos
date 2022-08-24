package com.marcianos.learning.service;

import com.marcianos.learning.entidades.BankAccount;

import java.math.BigDecimal;

public interface BankAccountService {

    BankAccount saveBrazilianBankAccount(String userEmail, String bankCode, BigDecimal balance,
                                         String agencyNumber, int accountNumber);

    BankAccount fixBankAccountDateTime(int id, int day, int month, int year, int hour, int min, int sec);

    BankAccount getBankAccount(int id);
}
