
package com.pi.manag.controller;

import com.pi.manag.entitie.Morador;
import com.pi.manag.service.MoradorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/morador")
public class MoradorAPIController {
   @Autowired
   MoradorService service;
   
   @GetMapping("/listar")
    public ResponseEntity<List> getAllMorador(){
     List<Morador> moradores = service.getAllMoradores();
     return new ResponseEntity<>(moradores,HttpStatus.OK);
    }
    @GetMapping("/pesquisar/{id}")
    public ResponseEntity<Morador> getMoradorById(@PathVariable Integer id){
        
        Morador morador = service.getMoradorId(id);
        return new ResponseEntity<>(morador,HttpStatus.OK);
    }
    
    @PostMapping("/adicionar")
    public ResponseEntity<Morador> addMorador(@RequestBody Morador morador){
        var novoFilme = service.criarMorador(morador, morador.getVeiculo(), morador.getApartamento());
        return new ResponseEntity<>(novoFilme, HttpStatus.CREATED);
    }
    
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Morador> atualizarMorador(@PathVariable Integer id, @RequestBody Morador morador){
        var moradorAtualizado = service.atualizarMorador(id, morador, morador.getVeiculo(), morador.getApartamento());
        return new ResponseEntity<>(moradorAtualizado,HttpStatus.OK);
    }
    
    @DeleteMapping("/deletar/{id}")
    
    public ResponseEntity deletarMorador(@PathVariable Integer id){
        service.deletarFilme(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
