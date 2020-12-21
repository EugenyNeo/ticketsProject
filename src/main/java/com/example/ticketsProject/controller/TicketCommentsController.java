package com.example.ticketsProject.controller;

import com.example.ticketsProject.repository.TicketCommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketCommentsController {

    @Autowired
    private TicketCommentRepository ticketCommentRepository;

}