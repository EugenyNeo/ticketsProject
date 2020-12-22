package com.example.ticketsProject.controller;

import com.example.ticketsProject.model.Ticket;
import com.example.ticketsProject.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listTickets", ticketService.getAllTickets());
        return  "index";
    }

    @GetMapping("/showNewTicketForm")
    public String showNewTicketForm(Model model){
        Ticket ticket = new Ticket();
        model.addAttribute("ticket", ticket);
        return "create";

    }

    @PostMapping("/saveTicket")
    public String saveTicket(@ModelAttribute("ticket") Ticket ticket) {
        ticketService.saveTicket(ticket);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value ="id") long id,  Model model){
        Ticket ticket = ticketService.getTicketById(id);

        model.addAttribute("ticket", ticket);
        return "update";
    }

    @GetMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable (value= "id") long id){
        this.ticketService.deletTicketById(id);
        return "redirect:/";
    }
}
