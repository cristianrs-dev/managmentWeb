package com.pi.manag.entitie;



public class Espaco {
    private int id;
    private String descricao;
    private Condominio endereco;
    
    
    public Espaco(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Espaco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Condominio getEndereco() {
        return endereco;
    }

    public void setEndereco(Condominio endereco) {
        this.endereco = endereco;
    }
    
    public void mostrarDadosEspaco(){
        System.out.println("----------Espaco Interno------------");
        System.out.println("cod: "+this.getId()+" área:.."+this.getDescricao());
    }
    
    
}
