package io.spring.guides.gs_producing_web_service;

public class GetReservationResponse {

        private Reservation reservation;

        public Reservation getReservation() {
            return reservation;
        }

        public void setReservation(Reservation value) {
            this.reservation = value;
        }

    public void setReservation(lt.viko.eif.tchatzilias.web.hotelroomservice.Reservation reservation) {

    }
}
