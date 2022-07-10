package com.bhd.mdmh.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi")
public class BoardController {

    @GetMapping("/board")
    public String getBoard() {
        return "test";
    }
}
