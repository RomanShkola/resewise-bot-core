package com.telegram.resewise.domain;

import com.telegram.resewise.api.v1.model.StatusUnit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "reservations")
public class UserReservation extends BaseEntity {

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "status")
    private StatusUnit status;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
}
