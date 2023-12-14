
package com.pi.manag.controller;

import com.pi.manag.entitie.User;
import com.pi.manag.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    
    @Autowired
    UserService service;
    
    @GetMapping("/login")
    public String pageLogin(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "index";
        
    }
    
    @PostMapping("/autenticar")
    public String autentitcar(@RequestBody User user){
        User usuario = new User();
        usuario.setLogin(user.getLogin());
         usuario.setSenha(user.getSenha());
        service.autenticar(usuario.getLogin(), usuario.getSenha());
        return "menu";
    }
    
    @GetMapping("/erro")
    public String pageErro(Model model){
        User erro = new User();
        model.addAttribute("erro",erro);
        return "redirect:/index";
    }
    

}
