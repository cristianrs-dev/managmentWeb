
package com.pi.manag.controller;

import com.pi.manag.entitie.Cargo;
import com.pi.manag.entitie.Funcionario;
import com.pi.manag.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FuncionarioController {
    @Autowired
    FuncionarioService service;
    
    /*PAGINA CADASTRO COLABORADOR*/
    @GetMapping("/cadFuncionario")
    public String pageCadFuncionario(Model model){
        model.addAttribute("funcionario", new Funcionario());
        model.addAttribute("cargo", new Cargo());
        return "cadColaborador";
    }
    
    /*PAGINA ATUALIZA CADASTRO COLABORADOR*/
    @GetMapping("/atualizaFuncionario")
    public String pageAtulizaCadFuncionario(Model model){
        model.addAttribute("funcionario", new Funcionario());
        model.addAttribute("cargo", new Cargo());
        return "atualizaCadColaborador";
    }
    
}
