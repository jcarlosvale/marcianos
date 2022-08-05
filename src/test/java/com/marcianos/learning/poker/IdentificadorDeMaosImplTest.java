package com.marcianos.learning.poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IdentificadorDeMaosImplTest {
    //TODO: CRIAR TESTES SOBRE STRAIGHT FLUSH
    //TODO: CRIAR TESTES SOBRE STRAIGHT FLUSH

    @Test
    void isStraight2() {
        //GIVEN
        var cards = new Card[] {
                new Card(Naipe.PAUS, 'T'),
                new Card(Naipe.COPAS, 'K'),
                new Card(Naipe.OURO, 'Q'),
                new Card(Naipe.PAUS, 'A'),
                new Card(Naipe.COPAS, 'J'),
        };
        IdentificadorDeMaos identificadorDeMaos = new IdentificadorDeMaosImpl();

        //WHEN
        var actual = identificadorDeMaos.isStraight(cards);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isStraight() {
        //GIVEN
        var cards = new Card[] {
                new Card(Naipe.PAUS, '3'),
                new Card(Naipe.COPAS, '5'),
                new Card(Naipe.OURO, '2'),
                new Card(Naipe.PAUS, 'A'),
                new Card(Naipe.COPAS, '4'),
        };
        IdentificadorDeMaos identificadorDeMaos = new IdentificadorDeMaosImpl();

        //WHEN
        var actual = identificadorDeMaos.isStraight(cards);

        //THEN
        assertTrue(actual);
    }

    @Test
    void isNotStraight() {
        //GIVEN
        var cards = new Card[] {
                new Card(Naipe.PAUS, '3'),
                new Card(Naipe.COPAS, '5'),
                new Card(Naipe.OURO, '2'),
                new Card(Naipe.PAUS, 'K'),
                new Card(Naipe.COPAS, '4'),
        };
        IdentificadorDeMaos identificadorDeMaos = new IdentificadorDeMaosImpl();

        //WHEN
        var actual = identificadorDeMaos.isStraight(cards);

        //THEN
        assertFalse(actual);
    }

    @Test
    void isNotFlush() {
        //GIVEN
        var cards = new Card[] {
                new Card(Naipe.PAUS, '3'),
                new Card(Naipe.COPAS, '5'),
                new Card(Naipe.OURO, '2'),
                new Card(Naipe.PAUS, 'A'),
                new Card(Naipe.COPAS, '4'),
        };
        IdentificadorDeMaos identificadorDeMaos = new IdentificadorDeMaosImpl();

        //WHEN
        var actual = identificadorDeMaos.isFlush(cards);

        //THEN
        assertFalse(actual);
    }

    @Test
    void isFlush() {
        //GIVEN
        var cards = new Card[] {
                new Card(Naipe.OURO, '3'),
                new Card(Naipe.OURO, '5'),
                new Card(Naipe.OURO, '2'),
                new Card(Naipe.OURO, 'A'),
                new Card(Naipe.OURO, '4'),
        };
        IdentificadorDeMaos identificadorDeMaos = new IdentificadorDeMaosImpl();

        //WHEN
        var actual = identificadorDeMaos.isFlush(cards);

        //THEN
        assertTrue(actual);
    }

}