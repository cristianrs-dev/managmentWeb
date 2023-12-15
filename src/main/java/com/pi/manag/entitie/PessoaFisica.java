package com.pi.manag.entitie;

import jakarta.persistence.Transient;



public abstract class PessoaFisica extends Pessoa {
    private char sexo;
    private String rg;
    private String cpf;


    public PessoaFisica(char sexo, String rg, String nome) {
        super(nome);
        this.sexo = sexo;
        this.rg=rg;
        
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica() {
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
