package com.telegram.resewise.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "services")
public class Service extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "unit")
    private String unit;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "service")
    private Set<UserReservation> reservations;
}
