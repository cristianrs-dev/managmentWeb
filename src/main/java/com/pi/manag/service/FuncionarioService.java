
package com.pi.manag.service;

import com.pi.manag.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRepository service;
}
