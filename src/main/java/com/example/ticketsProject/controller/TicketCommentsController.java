package com.example.ticketsProject.controller;

import com.example.ticketsProject.model.Ticket;
import com.example.ticketsProject.model.TicketComment;
import com.example.ticketsProject.repository.TicketCommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
@AllArgsConstructor
public class TicketCommentsController {

    @Autowired
    private TicketCommentRepository ticketCommentRepository;

}