package com.telegram.resewise.api.v1.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Interval {
    private TimeUnit timeUnit;
    private int value;
}
