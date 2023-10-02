package com.telegram.resewise.controllers;

import com.telegram.resewise.api.v1.model.ServiceDTO;
import com.telegram.resewise.services.ServiceManager;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("api/services")
public class ServiceController {

    private final ServiceManager serviceManager;

    public ServiceController(ServiceManager serviceManager) {
        this.serviceManager = serviceManager;
    }

    @PostMapping("/user/{id}")
    public ServiceDTO createService(@RequestBody ServiceDTO serviceDTO, @PathVariable Long id) {
        return serviceManager.createService(id, serviceDTO);
    }
    @GetMapping("/user/{id}")
    public Set<ServiceDTO> getServicesByUserId(@PathVariable Long id) {
        return serviceManager.getServicesByUserId(id);
    }
}
