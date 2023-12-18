package com.pi.manag.entitie;

import jakarta.persistence.CascadeType;
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
@Table(name="morador")
@EqualsAndHashCode(callSuper = true)
public class Morador extends PessoaFisica{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String titular
;    //@ManyToOne
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idApartamento")
    private Apartamento apartamento;
    
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCondominio")
    private Condominio condominio;
    
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idSecretaria")
    private Secretaria secretaria;
    
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVeiculo")
    private Veiculo veiculo;
    
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVisita")
    private Visitante visita;

    public Morador(Integer id, String titular, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.titular = titular;
        this.apartamento = apartamento;
        this.condominio = condominio;
        this.secretaria = secretaria;
        this.veiculo = veiculo;
        this.visita = visita;
    }

    public Morador(Integer id, String titular, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita, String nome) {
        super(nome);
        this.id = id;
        this.titular = titular;
        this.apartamento = apartamento;
        this.condominio = condominio;
        this.secretaria = secretaria;
        this.veiculo = veiculo;
        this.visita = visita;
    }

    public Morador(Integer id, String titular, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita) {
        this.id = id;
        this.titular = titular;
        this.apartamento = apartamento;
        this.condominio = condominio;
        this.secretaria = secretaria;
        this.veiculo = veiculo;
        this.visita = visita;
    }
    
    
    public Morador(Integer id, Veiculo veiculo, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.veiculo = veiculo;
    }

    public Morador(int id, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
    }

    public Morador(int id, String nome) {
        super(nome);
        this.id = id;
    }

    public Morador(String titular, Apartamento apartamento, Veiculo veiculo, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.titular = titular;
        this.apartamento = apartamento;
        this.veiculo = veiculo;
    }

    public Morador(String titular, Apartamento apartamento, Veiculo veiculo, String nome) {
        super(nome);
        this.titular = titular;
        this.apartamento = apartamento;
        this.veiculo = veiculo;
    }

    public Morador(String titular, Apartamento apartamento, Veiculo veiculo) {
        this.titular = titular;
        this.apartamento = apartamento;
        this.veiculo = veiculo;
    }
    

    public Morador() {
 
    }
   
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitular() {
        
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.equals("proprietario")){
            this.titular="proprietario";
        }else{
            this.titular="iniquilino";
        }
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
    
    
    
    
}
