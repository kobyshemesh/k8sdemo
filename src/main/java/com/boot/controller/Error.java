package com.boot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Error implements ErrorController{
	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "This is 404 Return by kshamama amazing application";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
