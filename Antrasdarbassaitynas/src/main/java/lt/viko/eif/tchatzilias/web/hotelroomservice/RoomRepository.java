package lt.viko.eif.tchatzilias.web.hotelroomservice;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;



@Component
public class RoomRepository {
    private static final Map<Integer, Room> rooms = new HashMap<>();

    private static final Map<Integer, Reservation> reservations = new HashMap<>();


    @PostConstruct
    public void initData() {
        Room room = new Room();
        room.setRoomNumber(1);
        room.setRoomType("Single");
        room.setRoomPrice(50.0);

        rooms.put(room.getRoomNumber(), room);

        room = new Room();
        room.setRoomNumber(2);
        room.setRoomType("Double");
        room.setRoomPrice(100.0);

        rooms.put(room.getRoomNumber(), room);

        room = new Room();
        room.setRoomNumber(3);
        room.setRoomType("Triple");
        room.setRoomPrice(150.0);

        rooms.put(room.getRoomNumber(), room);

        room = new Room();
        room.setRoomNumber(4);
        room.setRoomType("Quad");
        room.setRoomPrice(200.0);

        rooms.put(room.getRoomNumber(), room);

        room = new Room();
        room.setRoomNumber(5);
        room.setRoomType("Queen");
        room.setRoomPrice(250.0);

        rooms.put(room.getRoomNumber(), room);

        room = new Room();
        room.setRoomNumber(6);
        room.setRoomType("King");
        room.setRoomPrice(300.0);

        rooms.put(room.getRoomNumber(), room);
    }

    public Room findRoom(int roomNumber) {
        Assert.notNull(roomNumber, "The room number must not be null");
        return rooms.get(roomNumber);
    }

    public Reservation findReservation(int reservationId) {
        Assert.notNull(reservationId, "The reservation id must not be null");
        return reservations.get(reservationId);
    }

}
