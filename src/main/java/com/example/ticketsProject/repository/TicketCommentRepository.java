package com.example.ticketsProject.repository;


import com.example.ticketsProject.model.Ticket;
import com.example.ticketsProject.model.TicketComment;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface TicketCommentRepository extends PagingAndSortingRepository<TicketComment, Integer> {

    Page<TicketComment> findByTicket(Ticket ticket, Pageable pageable);
}