package com.example.reverseswagger;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserDTO {

    private String name;
    private String outraCoisa;
    private LocalDate date;

    public UserDTO(String name, String outraCoisa, LocalDate date) {
        this.name = name;
        this.outraCoisa = outraCoisa;
        this.date = date;
    }

    public UserDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutraCoisa() {
        return outraCoisa;
    }

    public void setOutraCoisa(String outraCoisa) {
        this.outraCoisa = outraCoisa;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

