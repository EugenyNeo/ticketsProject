package com.example.ticketsProject.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "User")
public class User {

    @Id
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;


}