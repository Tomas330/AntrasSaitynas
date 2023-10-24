package lt.viko.eif.tchatzilias.web.hotelroomservice;

public class Room extends io.spring.guides.gs_producing_web_service.Room {
    private int roomNumber;
    private String roomType;
    private double roomPrice;

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
}
