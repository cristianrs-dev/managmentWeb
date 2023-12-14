package com.pi.manag.entitie;


public class Visitante extends PessoaFisica{
    private int id;

    public Visitante(int id, char sexo, String rg, String nome) {
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
