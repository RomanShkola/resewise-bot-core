package com.telegram.resewise.repositories;

import com.telegram.resewise.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Set;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
