package com.pi.manag.controller;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Funcionario;
import com.pi.manag.service.ApartamentoService;
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
@RequestMapping("/apartamento")
public class ApartamentoAPIController {
    @Autowired
    ApartamentoService service;
    
    @GetMapping("/listar")
    public ResponseEntity<List> getAllApartamentos(){
     List<Apartamento> apartamentos = service.getAllApartamentos();
     return new ResponseEntity<>(apartamentos,HttpStatus.OK);
    }
    @GetMapping("/pesquisar/{id}")
    public ResponseEntity<Apartamento> getApartamentoById(@PathVariable Integer id){
        Apartamento apartamento = service.getApartamentoId(id);
        return new ResponseEntity<>(apartamento,HttpStatus.OK);
    }
    
    @PostMapping("/adicionar")
    public ResponseEntity<Apartamento> addApartamento(@RequestBody Apartamento apartamento){
        var novoApartamento = service.criarCriarApartamento(apartamento);
        return new ResponseEntity<>(novoApartamento, HttpStatus.CREATED);
    }
    
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Apartamento> atualizarApartamento(@PathVariable Integer id, @RequestBody Apartamento apartamento){
        var apartamentoAtualizado = service.atualizarApartamento(id, apartamento, apartamento.getEndereco());
        return new ResponseEntity<>(apartamentoAtualizado,HttpStatus.OK);
    }
    
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity deletarFuncionario(@PathVariable Integer id){
        service.deletarApartamento(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
