
package com.pi.manag.controller;

import com.pi.manag.entitie.User;
import com.pi.manag.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

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
    public String autentitcar(@RequestBody User user,Model model){
        User usuario = new User();
        usuario.setLogin(user.getLogin());
         usuario.setSenha(user.getSenha());
        boolean autenticado = service.autenticar(usuario.getLogin(), usuario.getSenha());
        if (autenticado) {
        return "redirect:/menu"; // Redireciona para o menu se autenticado com sucesso
    } else {
        model.addAttribute("error", true);
        return "redirect:/telaErro"; // Redireciona para a página de erro se a autenticação falhar
    }
    }
    //ESTE METODO EXIBE A PAGINA DE ERRO
    @GetMapping("/erro")
    public ModelAndView pageErro(){
        ModelAndView view = new ModelAndView("error");
        return view;
    }
    
    //ESTE METODO EXIBE A PAGINA MENU
     @GetMapping("/menu")
    public ModelAndView pageMenu(){
        ModelAndView view = new ModelAndView("menu");
        return view;
    }
    
    //ESTE METODO EXIBE A PAGINA MENU DA ADMINISTRAÇÃO
     @GetMapping("/menuAdm")
    public ModelAndView pageMenuAdm(){
        ModelAndView view = new ModelAndView("menuAdm");
        return view;
    }
    //ESTE METODO EXIBE A PAGINA MENU DA ADMINISTRAÇÃO
     @GetMapping("/menuAdmMorador")
    public ModelAndView pageMenuAdmMorador(){
        ModelAndView view = new ModelAndView("menuAdmMorador");
        return view;
    }
    
    
    
    

}
