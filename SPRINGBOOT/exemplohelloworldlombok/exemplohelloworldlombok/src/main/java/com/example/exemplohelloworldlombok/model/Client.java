package com.example.exemplohelloworldlombok.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Janine Tavares
 * @since 15/04/2020
 * @version 1.0
 */
@ToString
public class Client {
    @Getter @Setter
    private String nome;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String email;
}
