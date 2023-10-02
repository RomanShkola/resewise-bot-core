package com.telegram.resewise.api.v1.mapper;

import com.telegram.resewise.api.v1.model.ServiceDTO;
import com.telegram.resewise.domain.Service;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    Service serviceDTOToService(ServiceDTO serviceDTO);
    ServiceDTO serviceToServiceDTO(Service service);
}

