package com.hitema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="country_id", nullable=false, unique=true, length=11)
    private int id;

    @Column(name="country", length=20, nullable=true)
    private String name;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    public Country(int id, String name, LocalDateTime lastUpdate) {
        this.id = id;
        this.name = name;
        this.lastUpdate = lastUpdate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Country() {}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Id : "+ id + ", Country : "+ name;
    }
}
