package com.example.reverseswagger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    private Long id;
    private String name;
    private String outraCoisa;
    private LocalDate date;

    public UserEntity() {
    }

    public UserEntity(Long id, String name, String outraCoisa, LocalDate date) {
        this.id = id;
        this.name = name;
        this.outraCoisa = outraCoisa;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
