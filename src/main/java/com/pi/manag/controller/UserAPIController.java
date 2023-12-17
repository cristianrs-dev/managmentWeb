
package com.pi.manag.controller;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.User;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/user")
public class UserAPIController {
    @Autowired
    UserService service;
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<User> getUserId(@PathVariable Integer id){
        User user = service.getUserId(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @GetMapping("/listar")
    public ResponseEntity<List> getAllUser(){
     List<User> users = service.getAllUser();
     return new ResponseEntity<>(users,HttpStatus.OK);
    }
    
    @PostMapping("/adicionar")
    public ResponseEntity<User> addUser(@RequestBody User user){
        var novoUser = service.criarUser(user);
        return new ResponseEntity<>(novoUser, HttpStatus.CREATED);
    }
}
