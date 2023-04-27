package com.hitema.entities;

import com.hitema.dao.Dao;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.hitema.dao.AbstractDao.*;

@Entity
    @Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", nullable = false)
    private Long id;

    private String city;

    @ManyToOne @JoinColumn(name = "country_id")
    private Country country;

    public City() {
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City(String city, Long l) {
        this.id = l;
        this.city = city;
    }

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("id=").append(id);
        sb.append(", country='").append(city).append('\'');
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }

}
