package com.boot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Error implements ErrorController{
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "ohhhhhh this is 404! call kshamama@pivotal.io";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
