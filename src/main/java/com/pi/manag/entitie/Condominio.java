package com.pi.manag.entitie;



public class Condominio extends PessoaJuridica{
    private int id;
    private PessoaFisica morador;
    private String endereco;
    private Apartamento apartamento;
    private Espaco espaco;
    private Documento documento;

    public Condominio() {
    }

    public Condominio(String nome, String cnpj) {
        super("Village", "100000088877/1515");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PessoaFisica getMorador() {
        return morador;
    }

    public void setMorador(PessoaFisica morador) {
        this.morador = morador;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Apartamento getApartamento() {
        return apartamento;
    }

    public void setApartamento(Apartamento apartamento) {
        this.apartamento = apartamento;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
    
    @Override
    public void mostrarDados() {
        System.out.println("=====Registro Condominio======");
        System.out.println("razao social:.."+this.getNome());
        System.out.println("cnpj:.."+this.getCnpj());    }
    
}
