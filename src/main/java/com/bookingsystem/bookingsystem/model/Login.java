package com.bookingsystem.bookingsystem.model;

import javax.persistence.*;

@Entity
public class Login {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String password;

    public Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
