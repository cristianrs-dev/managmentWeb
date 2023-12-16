package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="apartamento")

public class Apartamento {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private int numeroApartamento;
    private int qtdQuarto;
    private int andar;
    private float valor;
    
    @ManyToOne
    @JoinColumn(name = "idCondominio")
    private Condominio endereco;
    
    public Apartamento(int id, int numeroApartamento, int qtdQuarto, int andar, float valor) {
        this.id = id;
        this.numeroApartamento = numeroApartamento;
        this.qtdQuarto = qtdQuarto;
        this.andar = andar;
        this.valor = valor;
    }

    public Apartamento() {
    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getQtdQuarto() {
        return qtdQuarto;
    }

    public void setQtdQuarto(int qtdQuarto) {
        this.qtdQuarto = qtdQuarto;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
*/
    
    
    public void mostrarApartamento(){
        
            System.out.println("----------Dados Apartamento---------");
            System.out.println("cod:.."+this.getId());
            System.out.println("numero:.."+this.getNumeroApartamento());
            System.out.println("quartos:.."+this.getQtdQuarto());
            System.out.println("andar:.."+this.getAndar());
            System.out.println("valor:.."+this.getValor());
            endereco.mostrarDados();
    }
    
}
