package io.spring.guides.gs_producing_web_service;

public class Reservation {

        private int reservationId;
        private int roomNumber;
        private String startDate;
        private double endDate;
        private String guestName;

        public Reservation() {
        }

        public Reservation(int reservationId, int roomNumber, String startDate,double endDate , String guestName) {
            this.reservationId = reservationId;
            this.roomNumber = roomNumber;
            this.startDate = startDate;
            this.guestName = guestName;
        }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getEndDate() {
        return endDate;
    }

    public void setEndDate(double endDate) {
        this.endDate = endDate;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
