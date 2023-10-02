package com.telegram.resewise.controllers;

import com.telegram.resewise.api.v1.model.ScheduleInputDTO;
import com.telegram.resewise.services.ScheduleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

//    @PostMapping("")
//    public void createSchedule(@RequestBody ScheduleInputDTO scheduleInputDTO, @PathVariable Long ownerId) {
//        scheduleService.createSchedule(scheduleInputDTO, ownerId);
//    }
}
