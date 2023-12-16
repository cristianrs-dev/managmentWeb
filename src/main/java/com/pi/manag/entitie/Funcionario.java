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
@Table(name="funcionario")
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends PessoaFisica{
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idCargo")
    private Cargo cargo;
    private float salario;
    @ManyToOne
    @JoinColumn(name = "idCondominio")
    private Condominio empregador;

    public Funcionario(int id, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Funcionario(int id, Cargo cargo, float salario, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
    }
   
    public Funcionario() {
    }
/*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public void registraCargoFuncionario(int id, String funcao,float salario){
        cargo = new Cargo(id, funcao, salario);
        cargo.setId(id);
        cargo.setFuncao(funcao);
        cargo.setSalario(salario);
        
    }
    public void registrarEmpregador(String nome,String cnpj){
        empregador = new Condominio(nome, cnpj);
        empregador.setNome(nome);
        empregador.setCnpj(cnpj);
    }*/
    @Override
    public void mostrarDados() {
            System.out.println("---------Dados Funcionario----------");
            System.out.println("Codigo:.."+this.getId());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("salario:.."+this.getSalario());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
    }
  
}
