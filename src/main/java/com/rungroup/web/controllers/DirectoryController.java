package com.rungroup.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectoryController {

    @GetMapping("/directory")
    public String getDirectory(){
        return"redirect:/clubs";
    }
}
