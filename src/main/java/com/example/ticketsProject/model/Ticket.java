package com.example.ticketsProject.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_date")
    private LocalDateTime createdDate;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_modified_date")
    private LocalDateTime lastModifiedDate;

    @Column(name="last_modified_by")
    private String lastModifiedBy;

    @Column(name="date" )
    private LocalDateTime date;

    @Column(name="description" )
    private String description;

    @Column(name="comment")
    private String comment;

    @Column(name="status")
    private String status;

//    public Ticket() {
//    }
//
//    public Ticket(String status) {
//        this.status = status;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
}
