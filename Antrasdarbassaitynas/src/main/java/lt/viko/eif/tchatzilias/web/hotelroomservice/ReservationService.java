package lt.viko.eif.tchatzilias.web.hotelroomservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;

@WebService
public class ReservationService {

    @WebMethod
    public Reservation getReservation(int reservationId) {

        Reservation reservation = new Reservation();
        reservation.setReservationId(reservationId);
        reservation.setRoomNumber(101);
        reservation.setStartDate(new Date());
        reservation.setEndDate(new Date());
        reservation.setGuestName("John Doe");
        return reservation;
    }

}
