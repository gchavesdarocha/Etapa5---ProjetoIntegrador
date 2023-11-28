package com.projetointegrador.controller;

import com.projetointegrador.data.LugarDisponivelEntity;
import com.projetointegrador.service.LugarDisponivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lugarDisponivel")
public class LugarDisponivelController {

    @Autowired
    LugarDisponivelService lugarDisponivelService;

    @GetMapping("")
    public String viewHomePage(Model model) {
        model.addAttribute("listarLugares", lugarDisponivelService.listarTodasTodosLugares());
        return "listarLugares";
    }

    @PostMapping("/salvarLugarDisponivel")
    public String salvarLugarDisponivel(@RequestBody LugarDisponivelEntity lugarDisponivel, BindingResult result) {
        if (result.hasErrors()) {
            return "atendente";
        }
        if (lugarDisponivel.getId() == 0) {
            lugarDisponivelService.criarLugar(lugarDisponivel);
        } else {
            lugarDisponivelService.atualizarLugar(lugarDisponivel.getId(), lugarDisponivel);
        }
        return "redirect:/atendente";
    }
}