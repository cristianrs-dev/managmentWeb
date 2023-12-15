package com.pi.manag.entitie;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;
@Data
@MappedSuperclass
public abstract class Pessoa{
    
   private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   public abstract void mostrarDados();
}
