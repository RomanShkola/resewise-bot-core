package com.telegram.resewise.api.v1.model;

import com.telegram.resewise.domain.Reservation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ScheduleOutput {
    private Set<ReservationDTO> reservations;
}
