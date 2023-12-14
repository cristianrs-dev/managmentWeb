package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="Morador")
public class Morador extends PessoaFisica{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "apartamento_id")
    private Apartamento apartamento;
    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;
    @ManyToOne
    @JoinColumn(name = "secretaria_id")
    private Secretaria secretaria;
    @ManyToOne
    @JoinColumn(name = "veiculo_id")
    private Veiculo veiculo;
    @ManyToOne
    @JoinColumn(name = "visita_id")
    private Visitante visita;
    
    /*
    public Morador(int id, Veiculo veiculo, char sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.veiculo = veiculo;
    }

    public Morador(int id, char sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Morador(int id, String nome) {
        super(nome);
        this.id = id;
    }

    public Morador() {
 
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "proprietario";
    }
    public void registrarTipoMorador(String tipo){
        this.tipo=tipo;
    }
    
    public void cadastrarApartamento(int id, int numeroApartamento, int qtdQuarto, int andar, float valor){
        apartamento = new Apartamento(id, numeroApartamento, qtdQuarto, andar, valor);
        apartamento.setId(id);
        apartamento.setNumeroApartamento(numeroApartamento);
        apartamento.setQtdQuarto(qtdQuarto);
        apartamento.setAndar(andar);
        apartamento.setValor(valor);
    }
    public void registrarCondomino(String nome, String cnpj){
        condominio = new Condominio(nome, cnpj);
        condominio.setNome(nome);
        condominio.setCnpj(cnpj);
    }
    public void cadastrarSecretaria(int id,String nome, char sexo, String rg){
        secretaria = new Secretaria(id, sexo, rg, nome);
        secretaria.setId(id);
        secretaria.setNome(nome);
        secretaria.setSexo(sexo);
        secretaria.setRg(rg);
    }
    public void cadastrarVeiculo(int idVeiculo,String tipo, String modelo, String placa, String cor){
        veiculo = new Veiculo(idVeiculo, tipo, modelo, placa, cor);
        veiculo.setId(idVeiculo);
        veiculo.setTipo(tipo);
        veiculo.setModelo(modelo);
        veiculo.setPlaca(placa);
        veiculo.setCor(cor);
        
    }
    public void cadastrarVisita(int idVisita,String nome, char sexo, String rg){
        visita = new Visitante(id, sexo, rg, nome);
        visita.setId(idVisita);
        visita.setNome(nome);
        visita.setSexo(sexo);
        visita.setRg(rg);
    }

    public void mostrarMorador(){
            System.out.println("Morador:");
            System.out.println("matricula:"+this.getId()+" nome:.."+this.getNome());
    }
    
    @Override
    public void mostrarDados() {
            
            System.out.println("=====REGISTRO MORADOR=====");
            System.out.println("codigo:.."+this.getId());
            System.out.println("Nome:.."+this.getNome());
            System.out.println("Sexo:.."+this.getSexo());
            System.out.println("Rg:.."+this.getRg());
            System.out.println("Cpf:.."+this.getCpf());     
    }
    
    */
    
    
}
