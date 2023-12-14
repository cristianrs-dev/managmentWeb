
package com.pi.manag.service;

import com.pi.manag.entitie.User;
import com.pi.manag.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository service;
    
    
    public boolean autenticar(String login, String password){
        User usuario = service.findByLogin(login);
        return usuario != null && usuario.getSenha().equals(password);
    }
    
    public User findByUserName(String login){
        return service.findByLogin(login);
    }
    
    
}
