package com.marcianos.learning.api.service.implementation.sort;

import com.marcianos.learning.api.entidade.ContaBancaria;

import java.util.Comparator;

public class OrdenarTitular implements Comparator<ContaBancaria> {
    @Override
    public int compare(ContaBancaria o1, ContaBancaria o2) {
        return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
    }
}
