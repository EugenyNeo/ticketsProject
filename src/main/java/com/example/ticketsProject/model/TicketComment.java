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

	@Column(name="created_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime createdDate;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="last_modified_date", columnDefinition = "TIMESTAMP")
	private LocalDateTime lastModifiedDate;

	@Column(name="last_modified_by")
	private String lastModifiedBy;

	@ManyToOne
	private Ticket ticket;

	@Column(name="date" , columnDefinition = "TIMESTAMP")
	private LocalDateTime date;

	@Column(name="comment")
	private String comment;

}
