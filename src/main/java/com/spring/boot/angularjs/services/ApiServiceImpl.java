package com.spring.boot.angularjs.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.boot.angularjs.interceptor.ApiInterceptor;
import com.spring.boot.angularjs.model.DayResponse;
import com.spring.boot.angularjs.model.MathResponse;

@Service("ApiService")
public class ApiServiceImpl implements ApiService
{

    static final Logger  log = Logger.getLogger(ApiServiceImpl.class);

    private RestTemplate restTemplate;

    ApiServiceImpl()
    {
        restTemplate = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new ApiInterceptor());
        restTemplate.setInterceptors(interceptors);
    }

    public DayResponse getFactAboutDay(String day, String month)
    {
        DayResponse response = restTemplate.getForObject("https://numbersapi.p.mashape.com/{month}/{day}/date?fragment=true&json=true", DayResponse.class, month, day);

        return response;
    }

    public MathResponse getMathPropertyAboutNumber(String number)
    {
        MathResponse response = restTemplate.getForObject("https://numbersapi.p.mashape.com/{number}/math?fragment=true&json=true", MathResponse.class, number);

        return response;
    }

}
