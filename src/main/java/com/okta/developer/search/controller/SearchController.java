package com.okta.developer.search.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping(value = "/hello")
    public String getSearchCountAuthorized() {
        return "hello";
    }

}
