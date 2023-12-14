package com.pi.manag.entitie;


public class Empresa extends PessoaJuridica {
    private int id;
    private String servico;
    private Condominio condominio;

    public Empresa(int idServico, String servico, String nome, String cnpj) {
        super(nome, cnpj);
        this.id = idServico;
        this.servico = servico;
    }

    public Empresa(int idServico, String nome, String cnpj) {
        super(nome, cnpj);
        this.id = idServico;
    }

    public Empresa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }
    public void mostrarCondominio(String nome, String cnpj){
        condominio = new Condominio();
        condominio.setNome(nome);
        condominio.setCnpj(cnpj);
    }
    public void mostrarEmpresa(){
        System.out.println("empresa");
        System.out.println("cod. "+this.getId()+" razao social:."+this.getNome());
        
    }
    @Override
    public void mostrarDados() {
        System.out.println("=========Empresa Agendada=====");
        System.out.println("razao social:.."+this.getNome());
        System.out.println("codigo:.."+this.getId());
        System.out.println("Cnpj:.."+this.getCnpj());
        System.out.println("Descricao:.."+this.getServico());
    }
    
}
