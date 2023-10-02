package com.telegram.resewise.services;

import com.telegram.resewise.api.v1.mapper.ScheduleMapper;
import com.telegram.resewise.api.v1.model.Interval;
import com.telegram.resewise.api.v1.model.ReservationDTO;
import com.telegram.resewise.api.v1.model.ScheduleInputDTO;
import com.telegram.resewise.api.v1.model.ScheduleOutput;
import com.telegram.resewise.domain.Schedule;
import com.telegram.resewise.repositories.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper mapper;

    public ScheduleService(ScheduleRepository scheduleRepository, ScheduleMapper scheduleMapper) {
        this.scheduleRepository = scheduleRepository;
        mapper = scheduleMapper;
    }

    public ScheduleOutput createSchedule(ScheduleInputDTO scheduleInputDTO, Long id){

        Schedule schedule = scheduleRepository.save(mapper.scheduleDTOToSchedule(scheduleInputDTO));
        return ScheduleOutput.builder().reservations(generateReservations(scheduleInputDTO)).build();
    }
    public ScheduleOutput getSchedule(LocalDateTime current) {

        return null;
    }
    private Set<ReservationDTO> generateReservations(ScheduleInputDTO scheduleInputDTO) {

        Set<ReservationDTO> reservations = new HashSet<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss");
        LocalDateTime startTime = LocalDateTime.parse(scheduleInputDTO.getStartTime(), formatter);
        LocalDateTime endTime = LocalDateTime.parse(scheduleInputDTO.getEndTime(), formatter);

        Interval interval = scheduleInputDTO.getInterval();

        if (scheduleInputDTO.getExcluded().isEmpty()) {
            while(startTime.isBefore(endTime)) {
                reservations.add(ReservationDTO.builder()
                        .startTime(startTime)
                        .endTime(addInterval(startTime, interval))
                        .id(scheduleInputDTO.getServiceIds())
                        .build());
                startTime = addInterval(startTime, interval);
            }
        }
        return reservations;
    }

    private LocalDateTime addInterval(LocalDateTime time, Interval interval) {
        LocalDateTime newTime = null;
        switch(interval.getTimeUnit()) {
            case HOUR -> newTime = time.plusHours(interval.getValue());
            case MINUTE -> newTime = time.plusMinutes(interval.getValue());
        }
        return newTime;
    }
}
