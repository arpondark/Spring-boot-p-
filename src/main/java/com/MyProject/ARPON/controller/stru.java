package com.MyProject.ARPON.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class stru {
    @GetMapping("/ar")
    public String Arp()
    {
        return "Arpon";
    }
}
