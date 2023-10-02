package com.telegram.resewise.repositories;

import com.telegram.resewise.domain.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
