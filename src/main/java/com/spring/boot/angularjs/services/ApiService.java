package com.spring.boot.angularjs.services;

import com.spring.boot.angularjs.model.DayResponse;
import com.spring.boot.angularjs.model.MathResponse;

public interface ApiService
{

    DayResponse getFactAboutDay(String day, String month);

    MathResponse getMathPropertyAboutNumber(String number);
}
