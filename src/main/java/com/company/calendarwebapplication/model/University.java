package com.company.calendarwebapplication.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Entity
public class University {

    private String universityName;
    private List<FieldOfStudy> listOfDegreeCourse = new ArrayList<>();
}
