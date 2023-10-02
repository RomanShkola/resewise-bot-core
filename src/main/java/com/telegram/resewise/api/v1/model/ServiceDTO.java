package com.telegram.resewise.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ServiceDTO {

    private String name;
    private BigDecimal price;
    private String unit;
}
