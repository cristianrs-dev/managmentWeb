package com.pi.manag.entitie;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public abstract class PessoaFisica extends Pessoa {
    private String sexo;
    private String rg;
    private String cpf;


    public PessoaFisica(String sexo, String rg, String nome) {
        super(nome);
        this.sexo = sexo;
        this.rg=rg;
        
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica() {
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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
