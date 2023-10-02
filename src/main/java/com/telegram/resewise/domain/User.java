package com.telegram.resewise.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "telegram_id")
    private String telegramId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Reservation> reservations = new HashSet<>();


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Reservation> owned = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Schedule> schedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Service> services = new HashSet<>();

}