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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private Role role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<UserReservation> reservations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Schedule> schedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Service> services = new HashSet<>();

}