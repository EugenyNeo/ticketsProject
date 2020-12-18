package com.example.ticketsProject.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketComment {

	@Id
	@GeneratedValue
	private Long id;

	private LocalDateTime createdDate;

	private String createdBy;

	private LocalDateTime lastModifiedDate;

	private String lastModifiedBy;

	@ManyToOne
	private Ticket ticket;

	private LocalDateTime date;

	@Column(columnDefinition = "TEXT")
	private String comment;

}
