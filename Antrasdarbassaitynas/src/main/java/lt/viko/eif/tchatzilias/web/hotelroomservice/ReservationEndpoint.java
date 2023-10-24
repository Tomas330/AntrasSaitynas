package lt.viko.eif.tchatzilias.web.hotelroomservice;

import io.spring.guides.gs_producing_web_service.GetReservationRequest;
import io.spring.guides.gs_producing_web_service.GetReservationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ReservationEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private RoomRepository roomRepository;

    @Autowired
    public ReservationEndpoint(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getReservationRequest")
    @ResponsePayload
    public GetReservationResponse GetReservation(@RequestPayload GetReservationRequest request) {
        GetReservationResponse response = new GetReservationResponse();
        response.setReservation(roomRepository.findReservation(request.getReservationId()));
        return response;
    }

}
