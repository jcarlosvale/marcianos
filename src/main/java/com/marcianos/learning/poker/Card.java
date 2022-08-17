package com.marcianos.learning.poker;


public class Card implements Comparable<Card>{

    private  Naipe naipe;
    private  char valorFace;


    public Card(){}

    public Card(final Naipe naipe, final char valorFace) {
        //TODO: validar valorFace --> T
        this.naipe = naipe;
        this.valorFace = valorFace; //A, 2....,9, T, J, Q, K, A
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public char getValorFace() {
        return valorFace;
    }

    /*
     = 0 ==> 2 objetos iguais
     > 0 ==> this > parametro
     < 0 ==> this < parametro
     */
    @Override
    public int compareTo(Card card) {
        return this.valorOrdinal() - card.valorOrdinal();
    }

    public int valorOrdinal() {
        //TODO: como resolver o ÁS?
        if (this.valorFace == 'T') return 10;
        if (this.valorFace == 'J') return 11;
        if (this.valorFace == 'Q') return 12;
        if (this.valorFace == 'K') return 13;
        if (this.valorFace == 'A') return 1;
        return this.valorFace - '0';
    }
}
