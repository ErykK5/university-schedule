package com.company.calendarwebapplication.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "FieldOfStudy")
public class FieldOfStudy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<User> listOfStudents = new ArrayList<>();

    @OneToMany
    private List<Event> listOfEvents = new ArrayList<>();

    private String nameOfFieldOfStudy;
}
