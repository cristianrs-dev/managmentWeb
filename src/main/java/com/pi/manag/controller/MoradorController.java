
package com.pi.manag.controller;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoradorController {
    @Autowired
    MoradorService service;
    /*CADASTRO MORADOR*/
    @GetMapping("/cadMorador")
    public String pageCadastroMorador(Model model){
        //Morador morador = new Morador();
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "cadMorador";
    }
    
    /*ATUALIZAR MORADOR*/
    @GetMapping("/atualizaMorador")
    public String pageAtualizaCadMorador(Model model){
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "atualizaMorador";
    }
    /*TELA CONSULTA MORADOR*/
    @GetMapping("/consultaMorador")
    public String pageConsultaMorador(Model model){
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "consultaMorador";
    }
    
    @PostMapping("/consultarMorador")
    public String getDadosMorador(@RequestParam Integer id,Model model){
        Morador morador = service.getMoradorId(id);
        model.addAttribute("morador", morador);
        return "consultaMorador";
    }

}
