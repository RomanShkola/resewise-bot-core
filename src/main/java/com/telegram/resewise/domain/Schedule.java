package com.telegram.resewise.domain;

import com.telegram.resewise.api.v1.model.ScheduleType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "schedules")
public class Schedule extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "type")
    private ScheduleType type;

    @Lob
    @Column(name = "data")
    private String data;

    @Column(name = "link")
    private String link;

}
