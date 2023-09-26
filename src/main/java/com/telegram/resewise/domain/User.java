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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<UserReservation> reservations = new HashSet<>();

}
