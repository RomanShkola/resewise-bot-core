package com.telegram.resewise.services;

import com.telegram.resewise.api.v1.mapper.ServiceMapper;
import com.telegram.resewise.api.v1.model.ServiceDTO;
import com.telegram.resewise.domain.Service;
import com.telegram.resewise.repositories.ServiceRepository;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ServiceManager {
    private final ServiceRepository serviceRepository;
    private final UserService userService;
    private final ServiceMapper mapper;

    public ServiceManager(ServiceRepository serviceRepository, UserService userService, ServiceMapper mapper) {
        this.serviceRepository = serviceRepository;
        this.userService = userService;
        this.mapper = mapper;
    }

    public ServiceDTO createService(Long id, ServiceDTO serviceDTO) {

        Service service = mapper.serviceDTOToService(serviceDTO);
        Service saved = serviceRepository.save(service);
        return mapper.serviceToServiceDTO(saved);
    }
    public Set<ServiceDTO> getServicesByUserId(Long id) {
        Set<ServiceDTO> services = userService.findServicesById(id).stream().map(mapper::serviceToServiceDTO).collect(Collectors.toSet());

        return services;
    }
}
