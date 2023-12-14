
package com.pi.manag.controller;

import com.pi.manag.entitie.User;
import com.pi.manag.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPIController {
    @Autowired
    UserService service;
    
    @PostMapping("/login")
    public ResponseEntity<String> autenticar(@RequestBody User user){
        String userName= user.getLogin();
        String userPassword = user.getSenha();
        if(service.autenticar(userName, userPassword)){
            return ResponseEntity.ok("Bem vindo"+userName);
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("login e senha invalidos");
        }
    }
}
