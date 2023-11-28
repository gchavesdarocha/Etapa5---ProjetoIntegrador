package com.projetointegrador.controller;

import com.projetointegrador.data.ClienteEntity;
import com.projetointegrador.service.ClienteService;
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
@RequestMapping("cliente")
public class ClientesController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("")
    public String viewHomePage(Model model) {
        model.addAttribute("listarCliente", clienteService.listarTodosClientes());
        return "listarCliente";
    }
    
    @PostMapping("/salvarCliente")
    public String salvarCliente(@RequestBody ClienteEntity cliente, BindingResult result) {
        if (result.hasErrors()) {
            return "gerente";
        }
        if (cliente.getId() == 0) {
            clienteService.criarCliente(cliente);
        } else {
            clienteService.atualizarCliente(cliente.getId(), cliente);
        }
        return "redirect:/gerente";
    }

    @PostMapping("/criarCliente")
    public String criarCliente(Model model, ClienteEntity cliente) {
        ClienteEntity an = new ClienteEntity();
        model.addAttribute("cliente", an);
        return "inserirCliente";
    }

    @PostMapping("/deletarCliente/{id}")
    public String deletarCliente(Model model, @PathVariable(value = "id") Integer id) {
        clienteService.deletarCliente(id);
        return "redirect:/cliente";
    }

    @PostMapping("/atualizarClienteForm/{id}")
    public String atualizarCliente(@PathVariable(value = "id") Integer id, Model model) {
        ClienteEntity an = clienteService.getCliente(id);
        model.addAttribute("novaAnalise", an);
        return "atualizarAnalise";
    }
}
