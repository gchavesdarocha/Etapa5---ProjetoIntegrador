package com.projetointegrador.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("atendente")
public class AtendenteController {

    @GetMapping("")
    public String viewHomePage() {
        return "atendente";
    }
}
