package com.pi.manag.entitie;


public class Apartamento {
    private int id;
    private int numeroApartamento;
    private int qtdQuarto;
    private int andar;
    private float valor;
    private Condominio endereco;
    
    public Apartamento(int id, int numeroApartamento, int qtdQuarto, int andar, float valor) {
        this.id = id;
        this.numeroApartamento = numeroApartamento;
        this.qtdQuarto = qtdQuarto;
        this.andar = andar;
        this.valor = valor;
    }

    public Apartamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public int getQtdQuarto() {
        return qtdQuarto;
    }

    public void setQtdQuarto(int qtdQuarto) {
        this.qtdQuarto = qtdQuarto;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    public void registrarEnderecoApartamento(String nome, String cnpj){
        endereco = new Condominio(nome, cnpj);
        endereco.setNome(nome);
        endereco.setCnpj(cnpj);
    }
    
    public void mostrarApartamento(){
        
            System.out.println("----------Dados Apartamento---------");
            System.out.println("cod:.."+this.getId());
            System.out.println("numero:.."+this.getNumeroApartamento());
            System.out.println("quartos:.."+this.getQtdQuarto());
            System.out.println("andar:.."+this.getAndar());
            System.out.println("valor:.."+this.getValor());
            endereco.mostrarDados();
    }
    
}
