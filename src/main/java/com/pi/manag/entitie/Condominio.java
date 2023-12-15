package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name="Condominio")
@EqualsAndHashCode(callSuper = false)
public class Condominio extends PessoaJuridica{
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String endereco;
    @ManyToOne
    @JoinColumn(name = "idApartamento")
    private Apartamento apartamento;
    //private Documento documento;

    public Condominio() {
    }

    public Condominio(String nome, String cnpj) {
        super("Village", "100000088877/1515");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public void mostrarDados() {
        System.out.println("=====Registro Condominio======");
        System.out.println("razao social:.."+this.getNome());
        System.out.println("cnpj:.."+this.getCnpj());    }
    
}
