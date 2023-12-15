
package com.pi.manag.service;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Cargo;
import com.pi.manag.entitie.Funcionario;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.repository.FuncionarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    @Autowired
    FuncionarioRepository service;
    
    public Funcionario criarFuncionario(Funcionario funcionario,Cargo cargo) {
        Integer id = funcionario.getId();
        if(id == null || !service.existsById(id)){
        funcionario.setId(null);
        funcionario.getCargo();
        }
        service.save(funcionario);
        return funcionario;
    }
    public List<Funcionario> getAllFuncionarios() {
        return service.findAll();
    }
    public Funcionario getFuncionarioId(Integer Id) {
        return service.findById(Id).orElse(null);
    }
    
    public void deletarFuncionario(Integer Id) {
        service.deleteById(Id);
    }
    public Funcionario atualizarFuncionario(Integer id, Funcionario funcionario,Cargo cargo) {
        Funcionario encontrado = getFuncionarioId(id);
            encontrado.setNome(funcionario.getNome());
            encontrado.setRg(funcionario.getRg());
            encontrado.setSexo(funcionario.getSexo());
            encontrado.setCargo(cargo);
            return service.save(encontrado);
    }
}
