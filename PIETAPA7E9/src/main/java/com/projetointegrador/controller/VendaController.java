package com.projetointegrador.controller;

import com.projetointegrador.data.VendaEntity;
import com.projetointegrador.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("venda")
public class VendaController {

    @Autowired
    VendaService vendaService;

    @GetMapping("")
    public String viewHomePage(Model model) {
        model.addAttribute("listarVenda", vendaService.listarTodasVendas());
        return "listarVenda";
    }

    @PostMapping("/salvarVenda")
    public String salvarVenda(@RequestBody VendaEntity venda, BindingResult result) {
        if (result.hasErrors()) {
            return "gerente";
        }
        if (venda.getId() == 0) {
            vendaService.criarVenda(venda);
        } else {
            vendaService.atualizarVenda(venda.getId(), venda);
        }
        return "redirect:/gerente";
    }

    @PostMapping("/deletarVenda/{id}")
    public String deletarVenda(Model model, @PathVariable(value = "id") Integer id) {
        vendaService.deletarVenda(id);
        return "redirect:/venda";
    }

    @PostMapping("/criarVenda")
    public String criarVenda(Model model) {
        VendaEntity an = new VendaEntity();
        model.addAttribute("venda", an);
        return "inserirVenda";
    }

    @PostMapping("/atualizarVendaForm/{id}")
    public String atualizarVenda(@PathVariable(value = "id") Integer id, Model model) {
        VendaEntity an = vendaService.getVenda(id);
        model.addAttribute("novaAnalise", an);
        return "atualizarAnalise";
    }
}
