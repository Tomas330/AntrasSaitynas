package io.spring.guides.gs_producing_web_service;

public class GetReservationRequest {

        private int reservationId;

        public int getReservationId() {
            return reservationId;
        }

        public void setReservationId(int value) {
            this.reservationId = value;
        }

}
