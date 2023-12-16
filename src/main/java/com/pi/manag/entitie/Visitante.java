package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="visitante")
@EqualsAndHashCode(callSuper = true)
public class Visitante extends PessoaFisica{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Visitante(int id, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Visitante() {
       
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void mostrarDados() {
       System.out.println("--------Visita--------");
            System.out.println("Codigo:.."+this.getId());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());
    }
    
}
