package com.example.ticketsProject.service;

import com.example.ticketsProject.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getAllTickets();
    void saveTicket(Ticket ticket);
    Ticket getTicketById(long id);
    void deletTicketById(long id);

}
