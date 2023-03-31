package com.pickpack.flightservice.service.ticket;

import com.pickpack.flightservice.api.request.OnewayTicketReq;
import com.pickpack.flightservice.api.request.RoundTicketReq;
import com.pickpack.flightservice.api.response.OneWayTicketRes;
import com.pickpack.flightservice.api.response.RoundTicketRes;

import java.util.List;

public interface TicketService {
    List<OneWayTicketRes> getOneWayTicketList(OnewayTicketReq ticketReq);
    List<RoundTicketRes> getRoundTicketList(RoundTicketReq ticketReq);
}
