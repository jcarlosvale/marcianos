package com.marcianos.learning.entidades;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private static final String NOME = "algum nome";
    private static final String EMAIL = "algum email";


    @Test
    void requiredConstructorTest() {
        //GIVEN

        //WHEN
        var usuario = new User(NOME, EMAIL);

        //THEN
        assertThat(usuario.getName()).isEqualTo(NOME);
        assertThat(usuario.getEmail()).isEqualTo(EMAIL);
    }

    @ParameterizedTest
    @MethodSource("invalidValues")
    void invalidValuesTest(final String nome, final String email) {
        //GIVEN WHEN THEN
        Assertions
                .assertThatThrownBy(() -> new User(nome, email))
                .isInstanceOf(RuntimeException.class);

    }

    static Stream<Arguments> invalidValues() {
        return Stream.of(
                Arguments.arguments(null, EMAIL),
                Arguments.arguments(NOME, null)
        );
    }

    @Test
    void equalsAndHashcodeContract() {
        EqualsVerifier.simple().forClass(User.class)
                .verify();
    }
}