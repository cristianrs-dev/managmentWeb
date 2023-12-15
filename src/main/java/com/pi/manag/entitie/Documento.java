/*package com.pi.manag.entitie;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.Data;



@Data
@Entity
@Table(name="Documento")
public class Documento {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipo;
     //@Type(type = "org.hibernate.type.LocalDateType");
    private String emissao;
    private String lancamento;
    
    
    public Documento(int idDocumento, String tipo) {
        this.id = idDocumento;
        this.tipo = tipo;  
    }

    public Documento() {
    }
    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }
    
    public void registrarEmissao(int dia, int mes,int ano) {
        LocalDate data=LocalDate.of(ano, mes, dia);
        this.emissao = data;
    }
    
    public void mostrarDataEmissao() {
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("cod: "+this.getId());
        System.out.println(" Tipo: "+this.getTipo());
        System.out.print("Data emissão:..");
        System.out.println(this.emissao.format(padrao));
    }
    
    public void registrarLancamento(int dia, int mes,int ano) {
        LocalDate data=LocalDate.of(ano, mes, dia);
        this.lancamento = data;
    }
    
    public void mostrarDataLancamento() {
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("cod: "+this.getId());
        System.out.println(" Tipo: "+this.getTipo());
        System.out.print("Data lançamento:..");
        System.out.println(this.lancamento.format(padrao));
    }
    
}*/
