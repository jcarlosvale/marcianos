package com.marcianos.learning.datasEHorarios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHoraJava {

    public static void main(String[] args) {
        //new
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

//        System.out.println("LocalDateTime: " + localDateTime);
//        System.out.println("LocalTime: " + localTime);
//        System.out.println("LocalDate: " + localDate);
//        System.out.println("ZonedDateTime: " + zonedDateTime);

        LocalDateTime aniversario = LocalDateTime.of(1980, 06, 25, 11, 15, 30);
//        System.out.println("Data aniversario: " + aniversario);

        var dateFromString = LocalDate.parse("1822-09-07");
//        System.out.println("Independencia: " + dateFromString);

        //DateFormatters
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MM yyyy - HH:mm");
        //DateTime --> String
//        System.out.println(df.format(aniversario));
        //String --> DateTime
        //var dateTime = df.parse("24 08 2022 - 21:17");
        LocalDateTime dateTime = LocalDateTime.parse("24 08 2022 - 21:17", df);
//        System.out.println(dateTime);
//
//        System.out.println(aniversario.getDayOfWeek());

        //Fuso --> ZonedDateTime
        LocalDateTime dataCadastro = LocalDateTime.now();
        ZonedDateTime zonedDateTimeBSB = ZonedDateTime.of(dataCadastro, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTimeEE = ZonedDateTime.of(dataCadastro, ZoneId.of("Europe/Tallinn"));
        ZonedDateTime zonedDateTimePT = ZonedDateTime.of(dataCadastro, ZoneId.of("Europe/Lisbon"));

//        System.out.println(dataCadastro);
//        System.out.println(zonedDateTimeBSB);
//        System.out.println(zonedDateTimeEE);
//        System.out.println(zonedDateTimePT);
//
//        System.out.println("FUSO: " + zonedDateTimeBSB.withZoneSameInstant(ZoneId.of("Europe/Tallinn")));
//        System.out.println("FUSO: " + zonedDateTimePT.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")));

        //Operacoes
        System.out.println(aniversario.plusDays(7));
        System.out.println(aniversario);
    }
}
