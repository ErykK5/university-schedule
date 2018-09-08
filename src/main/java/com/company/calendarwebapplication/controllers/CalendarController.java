package com.company.calendarwebapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
class CalendarController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView index() {
            return new ModelAndView("jsoncalendar");
        }
}
