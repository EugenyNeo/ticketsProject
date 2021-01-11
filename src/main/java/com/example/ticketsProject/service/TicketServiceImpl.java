package com.example.ticketsProject.service;

import com.example.ticketsProject.model.Ticket;
import com.example.ticketsProject.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements  TicketService{

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets(){

        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        this.ticketRepository.save(ticket);
    }

    @Override
    public Ticket getTicketById(long id) {
        Optional<Ticket> optional = ticketRepository.findById(id);
        Ticket ticket = null;
        if (optional.isPresent()){
            ticket = optional.get();
        }else{
            throw new RuntimeException("the ticket is not found for :: id" +id);
        }
        return ticket;
    }

    @Override
    public void deletTicketById(long id) {
        this.ticketRepository.deleteById(id);

    }
}
