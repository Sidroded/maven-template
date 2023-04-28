package org.example.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
