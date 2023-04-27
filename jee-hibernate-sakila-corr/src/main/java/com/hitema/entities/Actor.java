package com.hitema.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
    @Table(name="actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @ManyToMany(mappedBy = "actors")
    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Country{");
        sb.append("id=").append(id);
        sb.append(", Nom:'").append(lastname).append('\'');
        sb.append(", Prénom:").append(firstname);
        sb.append('}');
        return sb.toString();
    }
}
