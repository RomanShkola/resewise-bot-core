package com.telegram.resewise.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.telegram.resewise.domain.Service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @JsonProperty("service_ids")
    private Set<Long> id;
}
