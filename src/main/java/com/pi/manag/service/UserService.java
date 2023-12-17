
package com.pi.manag.service;

import com.pi.manag.entitie.User;
import com.pi.manag.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository service;
    
    
    public User criarUser(User user) {
        Integer id = user.getId();
        if(id == null || !service.existsById(id)){
        user.setId(null);
        }
        service.save(user);
        return user;
    }

    public User atualizarUser(Integer id, User user) {
        User encontrado = getUserId(id);
            encontrado.setLogin(user.getLogin());
            encontrado.setSenha(user.getSenha());
            encontrado.setNome(user.getNome());
            encontrado.setTipo(user.getTipo());
            return service.save(encontrado);
    }

    public User getUserId(Integer Id) {
        return service.findById(Id).orElse(null);
    }

    public List<User> getAllUser() {
        return service.findAll();
    }

    public void deletarUser(Integer Id) {
        service.deleteById(Id);
    }
    
    
}
