package com.telegram.resewise.api.v1.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Set;

@Builder
@Data
public class ScheduleInput {
    private ScheduleType type;
    private Set<String> value;
    private Interval interval;
    private ArrayList<String> excluded;

}
