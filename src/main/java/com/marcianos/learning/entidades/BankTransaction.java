package com.marcianos.learning.entidades;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BankTransaction {

    private BigDecimal value;
    private Currency currency;
    private BankOperation operation;
    private BankAccount senderAccount;
    private BankAccount receiverAccount;
    private LocalDateTime dateOperation;

}
