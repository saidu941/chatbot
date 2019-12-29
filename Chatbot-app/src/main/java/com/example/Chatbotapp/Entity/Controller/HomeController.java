package com.example.Chatbotapp.Entity.Controller;

import com.example.Chatbotapp.Entity.Weather;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/testWeather/{city}")
    public Weather getWeather(@PathVariable("city") String city) {
        return new Weather("description of this city weather is 80 F", city);
    }
}
