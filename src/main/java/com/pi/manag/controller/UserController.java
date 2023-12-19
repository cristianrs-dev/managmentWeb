
package com.pi.manag.controller;

import com.pi.manag.entitie.User;
import com.pi.manag.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String autentitcar(@ModelAttribute User user){
        String retorno="";
        List<User> usuarios = service.getAllUser();
        for(User encontrado:usuarios){
            if(encontrado.getLogin().equals(user.getLogin())){
                if(encontrado.getSenha().equals(user.getSenha()))
                    retorno= "menu";
            }else{
                   retorno= "error" ; 
              }
        }
        return retorno;
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
    
    ////ESTE METODO EXIBE A PAGINA MENU DA ADMINISTRAÇÃO
     @GetMapping("/toast")
    public ModelAndView pageToast(){
        ModelAndView view = new ModelAndView("toast");
        return view;
    }
    
    
    
    

}
