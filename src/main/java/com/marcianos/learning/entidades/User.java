package com.marcianos.learning.entidades;

import lombok.Data;
import lombok.NonNull;

@Data
public class User implements Entity{

    private final String name;
    private final String email;

    public User(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void validate() throws Exception {

    }
}
