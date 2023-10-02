package com.telegram.resewise.api.v1.mapper;

import com.telegram.resewise.api.v1.model.ScheduleInputDTO;
import com.telegram.resewise.domain.Schedule;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {
    Schedule scheduleDTOToSchedule(ScheduleInputDTO scheduleInputDTO);
}
