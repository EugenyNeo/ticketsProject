package com.example.ticketsProject.controller;

import com.example.ticketsProject.model.Ticket;
import com.example.ticketsProject.model.TicketComment;
import com.example.ticketsProject.repository.TicketCommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityNotFoundException;
import java.util.Collections;

@Controller
@RequestMapping("tickets/{ticket:id}/comments")
@AllArgsConstructor
public class TicketCommentsController {

    @Autowired
    private TicketCommentRepository ticketCommentRepository;

    @PostMapping
    public ModelAndView create( @PathVariable Ticket ticket) throws EntityNotFoundException {

        return new ModelAndView("redirect:/tickets/" + ticket);
    }


    @GetMapping("{comment:id}/delete")
    public ModelAndView deletePage(@PathVariable Ticket ticket, @PathVariable TicketComment comment) throws EntityNotFoundException {
        if (comment == null) {
            throw new EntityNotFoundException("error.ticketComment.notFound");
        }
        if (ticket == null ) {
            throw new EntityNotFoundException("error.ticket.notFound");
        }

        return new ModelAndView("tickets/comments/delete", Collections.singletonMap("comment", comment));
    }


    @PostMapping("{comment:id}/delete")
    public ModelAndView delete(@PathVariable Ticket ticket, @PathVariable TicketComment comment) throws EntityNotFoundException {
        if (comment == null) {
            throw new EntityNotFoundException("error.ticketComment.notFound");
        }
        if (ticket == null) {
            throw new EntityNotFoundException("error.ticket.notFound");
        }

        ticketCommentRepository.delete(comment);

        return new ModelAndView("redirect:/tickets/" + comment);
    }
}