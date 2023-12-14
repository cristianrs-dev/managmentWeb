package com.pi.manag.entitie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Cargo{
    private int id;
    private String funcao;
    private float salario;
    private LocalDate admissao;
    private LocalDate demissao;
    
    public Cargo(int id, String Funcao, float salario) {
        this.id = id;
        this.funcao = Funcao;
        this.salario = salario;
    }

    public Cargo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String Funcao) {
        this.funcao = Funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }
    
    public void registrarDataAdmissao(int dia,int mes,int ano){
       
        this.admissao = LocalDate.of(ano,mes,dia);
    }
   
    public LocalDate getDemissao() {
        return demissao;
    }
    
     public void registrarDataDemissao(int dia,int mes,int ano){
     
        this.demissao = LocalDate.of(ano,mes,dia);
    }
   
    public void mostrarDataAdmissao(){
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("cod:."+this.getId());
        System.out.println("Funcao:."+this.getFuncao());
        System.out.println("Salário:R$"+this.getSalario());
        System.out.println("Admissão em:."+this.admissao.format(padrao));
    }
    
    public void mostrarDataDemissao(){
        DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("cod:."+this.getId());
        System.out.println("Funcao:."+this.getFuncao());
        System.out.println("Salário:R$"+this.getSalario());
        System.out.println("Desligamento em:."+this.demissao.format(padrao));
    }
    
    public void mostrarCargo(){
        System.out.print("cod:."+this.getId());
        System.out.print(" Funcao:."+this.getFuncao());
        System.out.println(" Salário:R$"+this.getSalario());
    }
    
}
