package com.marcianos.learning.exercicio;

public class PalavraAoContrario implements CharSequence {
    private final CharSequence palavra;

    public PalavraAoContrario(final CharSequence palavra) {
        String resultado = "";
        for(int i = palavra.length()-1; i >= 0; i--) {
            resultado += palavra.charAt(i);
        }
        this.palavra = resultado;
    }

    @Override
    public char charAt(int pos) {
        return palavra.charAt(pos);
    }

    @Override
    public int length() {
        return palavra.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.palavra.subSequence(start, end);
    }

    @Override
    public String toString() {
        return palavra.toString();
    }
}