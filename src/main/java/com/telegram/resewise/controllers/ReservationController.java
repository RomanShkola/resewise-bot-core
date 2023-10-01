package com.telegram.resewise.controllers;

import com.telegram.resewise.api.v1.model.ScheduleInput;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @PostMapping("/schedules")
    public void createSchedule(@RequestBody ScheduleInput scheduleInput, @PathVariable Long ownerId) {

    }

}