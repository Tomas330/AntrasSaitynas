package lt.viko.eif.tchatzilias.web.hotelroomservice;

import io.spring.guides.gs_producing_web_service.GetRoomRequest;
import io.spring.guides.gs_producing_web_service.GetRoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class RoomEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private RoomRepository roomRepository;

    @Autowired
    public RoomEndpoint(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRoomRequest")
    @ResponsePayload
    public GetRoomResponse GetRoom(@RequestPayload GetRoomRequest request){
        GetRoomResponse response = new GetRoomResponse();

        response.setRoom(roomRepository.findRoom(request.getRoomNumber()));
        return response;
    }


}
