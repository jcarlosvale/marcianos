package com.marcianos.learning.poker;

import java.util.Arrays;

public class IdentificadorDeMaosImpl implements IdentificadorDeMaos{
    @Override
    public boolean isFlush(final Card[] cards) {
        //TODO: validar vetor, validar tamanho, validar is not null
        final Naipe naipe = cards[0].getNaipe();

        for(int i = 1; i < cards.length; i++) {
            if (! cards[i].getNaipe().equals(naipe)) {
                return false;
            }
        }
        return true;
    }

    @Override
    //N log N + N ==> O(N log N)
    public boolean isStraight(Card[] cards) {
        //ordenando, executa o compareTo
        Arrays.sort(cards); //n logN
        for(int i = 1; i < cards.length; i++) { //n
            if (cards[i].valorOrdinal() - cards[i-1].valorOrdinal() != 1) return false;
        }
        return true;
    }

    @Override
    public boolean isStraightFlush(Card[] cards) {
        return isStraight(cards) && isFlush(cards);
    }
}
