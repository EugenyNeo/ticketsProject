package com.example.ticketsProject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


public enum TicketStatus {
	OPEN ("OPEN"),
	ASSIGNED("ASSIGNED"),
	CLOSED("CLOSED");

	private String status;

	TicketStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
