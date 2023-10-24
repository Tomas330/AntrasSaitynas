package lt.viko.eif.tchatzilias.web.hotelroomservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class RoomService {

    @WebMethod
    public Room getRoom(int roomNumber) {
        Room room = new Room();
        room.setRoomNumber(roomNumber);
        room.setRoomType("Single");
        room.setRoomPrice(50.0);
        return room;
    }
}
