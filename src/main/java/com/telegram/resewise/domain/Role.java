package com.telegram.resewise.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "role")
public class Role extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}