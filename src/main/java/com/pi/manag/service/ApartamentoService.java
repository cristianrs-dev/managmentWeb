
package com.pi.manag.service;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Condominio;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.repository.ApartamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartamentoService {
   @Autowired
   ApartamentoRepository service;
   
   public Apartamento criarCriarApartamento(Apartamento apartamento) {
        Integer id = apartamento.getId();
        if(id == null || !service.existsById(id)){
        apartamento.setId(null);
        apartamento.setEndereco(apartamento.getEndereco());
        
        }
        service.save(apartamento);
        return apartamento;
    }
    public List<Apartamento> getAllApartamentos() {
        return service.findAll();
    }
    public Apartamento getApartamentoId(Integer Id) {
        return service.findById(Id).orElse(null);
    }
    
    public void deletarApartamento(Integer Id) {
        service.deleteById(Id);
    }
    public Apartamento atualizarApartamento(Integer id, Apartamento apartamento,Condominio condo) {
        Apartamento encontrado = getApartamentoId(id);
            encontrado.setAndar(apartamento.getAndar());
            encontrado.setNumeroApartamento(apartamento.getNumeroApartamento());
            return service.save(encontrado);
    }
}
