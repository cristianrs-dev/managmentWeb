package com.pi.manag.entitie;




public class Secretaria extends PessoaFisica{
    private int id;
    private String observacao;

    public Secretaria(int id, char sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Secretaria() {
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao ="nao autorizado";
    }

    public void registrarObservacao(String observacao){
        this.observacao=observacao;
    }
    @Override
    public void mostrarDados() {
           System.out.println("---------Dados Secretaria-------");
           System.out.println("Secretaria------------");
           System.out.println("Codigo:.."+this.getId());
           System.out.println("Nome:.."+this.getNome());
           System.out.println("Sexo:.."+this.getSexo());
           System.out.println("Rg:.."+this.getRg());
           System.out.println("Cpf:.."+this.getCpf());
           System.out.println("obs:.."+this.getObservacao());
    }
    
}