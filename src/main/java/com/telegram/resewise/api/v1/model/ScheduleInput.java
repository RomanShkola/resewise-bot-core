package com.telegram.resewise.api.v1.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

@Builder
@Data
public class ScheduleInput {
    private Interval interval;
    private ArrayList<String> excluded;
    private String startTime;
    private String endTime;
}
