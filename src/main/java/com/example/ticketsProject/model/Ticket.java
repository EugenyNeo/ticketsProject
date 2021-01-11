package com.example.ticketsProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="created_date" )
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime createdDate;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="last_modified_date")
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime lastModifiedDate;

    @Column(name="last_modified_by")
    private String lastModifiedBy;

    @Column(name="date"  )
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime date;

    @Column(name="description" )
    private String description;

    @Column(name="comment")
    private String comment;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private TicketStatus status;

}

