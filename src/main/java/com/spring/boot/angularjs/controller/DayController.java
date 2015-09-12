package com.spring.boot.angularjs.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.angularjs.model.DayResponse;
import com.spring.boot.angularjs.services.ApiService;

@RestController
@RequestMapping("/day")
public class DayController
{

    static final Logger log = Logger.getLogger(DayController.class);

    @Autowired
    private ApiService  apiService;

    @RequestMapping("/{day}/{month}")
    public @ResponseBody DayResponse getFactAboutDay(@PathVariable("day") String day,
            @PathVariable("month") String month)
    {

        DayResponse dayResponse = apiService.getFactAboutDay(day, month);
        return dayResponse;
    }

}
