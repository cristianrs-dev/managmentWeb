
package com.pi.manag.repository;

import com.pi.manag.entitie.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    
}
