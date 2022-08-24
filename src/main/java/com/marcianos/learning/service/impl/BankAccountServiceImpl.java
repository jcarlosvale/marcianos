package com.marcianos.learning.service.impl;

import com.marcianos.learning.entidades.BankAccount;
import com.marcianos.learning.service.BankAccountService;

import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class BankAccountServiceImpl implements BankAccountService {
    @Override
    public BankAccount saveBrazilianBankAccount(String userEmail, String bankCode, BigDecimal balance,
                                                String agencyNumber, int accountNumber){
        return null;
    }

    @Override
    public BankAccount fixBankAccountDateTime(int id, int day, int month, int year, int hour, int min, int sec) {
        return null;
    }

    @Override
    public BankAccount getBankAccount(int id) {
        return null;
    }

    //DATAS
    public static void main(String[] args) {
        //criação
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(1980, 6, 25);
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.parse("2007-12-03");
        System.out.println(localDate1);

        //qual dia da semana voce nasceu?
        System.out.println(localDate.getDayOfWeek());

        //formatando
        var df = DateTimeFormatter.ofPattern("dd MM yy - HH, mm");
        System.out.println(df.format(LocalDateTime.now()));

        //Operacoes
        System.out.println(localDateTime.plusDays(2));
        System.out.println(localDateTime);

        //Fuso Horário
        LocalDateTime dataCadastro = LocalDateTime.now();
        ZonedDateTime zonedDateTimeBSB = ZonedDateTime.of(dataCadastro, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTimeEE = ZonedDateTime.of(dataCadastro, ZoneId.of("Europe/Tallinn"));
        ZonedDateTime zonedDateTimePT = ZonedDateTime.of(dataCadastro, ZoneId.of("Europe/Lisbon"));

        System.out.println(dataCadastro);
        System.out.println(zonedDateTimeBSB);
        System.out.println(zonedDateTimeEE);
        System.out.println(zonedDateTimePT);

        System.out.println("FUSO: " + zonedDateTimeBSB.withZoneSameInstant(ZoneId.of("Europe/Tallinn")));

        //Ajustes
        //TemporalAdjusters.next(DayOfWeek.FRIDAY);
        System.out.println(localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

    }
}
