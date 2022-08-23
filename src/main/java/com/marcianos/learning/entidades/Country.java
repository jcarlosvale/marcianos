package com.marcianos.learning.entidades;

import lombok.Data;

@Data
public class Country implements Entity{

    private String code;
    private String description;


    @Override
    public void validate() throws Exception {

    }
}
