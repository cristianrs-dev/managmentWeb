
package com.pi.manag.service;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.repository.ApartamentoRepository;
import com.pi.manag.repository.MoradorRepository;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoradorService {
    @Autowired
    MoradorRepository service;
    @Autowired
    ApartamentoRepository serviceAp;
    
    public Morador criarMorador(Morador morador,Veiculo veiculo,Apartamento apartamento) {
        Integer id = morador.getId();
        if(id == null || !service.existsById(id)){
        morador.setId(null);
        morador.setVeiculo(veiculo);
        morador.setApartamento(apartamento);
        }
        service.save(morador);
        return morador;
    }
    public List<Morador> getAllMoradores() {
        return service.findAll();
    }
    public Morador getMoradorId(Integer Id) {
       return service.findById(Id).orElse(null);
    }
    
    public void deletarMorador(Integer Id) {
        service.deleteById(Id);
    }
    public Morador atualizarMorador(Integer id, Morador morador, Veiculo veiculo, Apartamento apartamento) {
        Morador encontrado = getMoradorId(id);
            encontrado.setNome(morador.getNome());
            encontrado.setRg(morador.getRg());
            encontrado.setSexo(morador.getSexo());
            encontrado.setTipo(morador.getTipo());
            encontrado.setVeiculo(veiculo);
            encontrado.setApartamento(apartamento);
            return service.save(encontrado);
    }
    
    
    
}
