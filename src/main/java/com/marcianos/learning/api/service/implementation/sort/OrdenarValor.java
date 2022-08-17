package com.marcianos.learning.api.service.implementation.sort;

import com.marcianos.learning.api.entidade.ContaBancaria;

import java.util.Comparator;

public class OrdenarValor implements Comparator<ContaBancaria> { // ordenação secundária
    @Override
    public int compare(ContaBancaria o1, ContaBancaria o2) {

        return o1.getSaldo().compareTo(o2.getSaldo());
    } // or
}
