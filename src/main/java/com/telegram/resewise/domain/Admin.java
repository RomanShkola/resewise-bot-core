package com.telegram.resewise.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "admins")
public class Admin extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admin")
    private Set<Schedule> schedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admin")
    private Set<Service> services = new HashSet<>();

}
