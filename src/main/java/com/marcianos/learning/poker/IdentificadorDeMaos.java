package com.marcianos.learning.poker;

public interface IdentificadorDeMaos {

    boolean isFlush(Card [] cards);

    boolean isStraight(Card [] cards);

    boolean isStraightFlush(Card [] cards);
}
