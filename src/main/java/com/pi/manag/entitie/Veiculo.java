package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="veiculo")
public class Veiculo {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipo;
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo() {
    }

    
    public Veiculo(int idVeiculo,String tipo, String modelo, String placa, String cor) {
        this.id=idVeiculo;
        this.tipo = tipo;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    public Veiculo(String tipo, String modelo, String placa, String cor) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    

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
        if(tipo.equals("carro")){
            this.tipo="carro";
        }else{
            this.tipo = "moto";
        }
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    
    public void mostrarVeiculo(){
        System.out.println("Veiculo---------------");
            System.out.println("Tipo:.."+this.getTipo());
            System.out.println("Modelo:.."+this.getModelo());
            System.out.println("Placa:.."+this.getPlaca());
            System.out.println("Cor:.."+this.getModelo());
        
    }
    

    
    
}
