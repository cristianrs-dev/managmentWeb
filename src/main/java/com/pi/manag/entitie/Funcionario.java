package com.pi.manag.entitie;




public class Funcionario extends PessoaFisica{
    private int id;
    private Cargo cargo;
    private float salario;
    private Condominio empregador;

    public Funcionario(int id, char sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Funcionario(int id, Cargo cargo, float salario, char sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
    }
   
    public Funcionario() {
    }

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
    }
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
