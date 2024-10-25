package com.daya.controller;

import com.daya.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler(){
        ApiResponse response = new ApiResponse();
        response.setMessage("Welcome to ecommerce vendor system");
        return response;

    }
}
