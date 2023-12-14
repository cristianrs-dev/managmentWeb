/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pi.manag.controller;

import com.pi.manag.entitie.Morador;
import com.pi.manag.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoradorController {
    @Autowired
    MoradorService service;
    
    @GetMapping("/cadMorador")
    public String pageCadastroMorador(Model model){
        Morador morador = new Morador();
        model.addAttribute("morador", morador);
        return "cadMorador";
    }
}
