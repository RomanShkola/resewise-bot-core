package com.telegram.resewise.api.v1.mapper;

import com.telegram.resewise.api.v1.model.ReservationDTO;
import com.telegram.resewise.domain.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    ReservationDTO reservationToReservationDTO(Reservation reservation);
    Reservation reservationDTOToReservation(ReservationDTO reservationDTO);
}
