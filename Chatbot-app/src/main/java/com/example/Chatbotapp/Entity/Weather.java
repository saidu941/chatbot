package com.example.Chatbotapp.Entity;

import org.springframework.stereotype.Component;

@Component
public class Weather {
    String desc;
    String city;

    public Weather(String desc, String city) {
        this.desc = desc;
        this.city = city;
    }
}
