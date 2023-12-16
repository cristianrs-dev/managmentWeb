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
    private String tipo;
    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idApartamento")
    private Apartamento apartamento;
    
    @ManyToOne
    @JoinColumn(name = "idCondominio")
    private Condominio condominio;
    
    @ManyToOne
    @JoinColumn(name = "idSecretaria")
    private Secretaria secretaria;
    
    @ManyToOne
    @JoinColumn(name = "idVeiculo")
    private Veiculo veiculo;
    
    @ManyToOne
    @JoinColumn(name = "idVisita")
    private Visitante visita;

    public Morador(Integer id, String tipo, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita, String sexo, String rg, String nome) {
        super(sexo, rg, nome);
        this.id = id;
        this.tipo = tipo;
        this.apartamento = apartamento;
        this.condominio = condominio;
        this.secretaria = secretaria;
        this.veiculo = veiculo;
        this.visita = visita;
    }

    public Morador(Integer id, String tipo, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita, String nome) {
        super(nome);
        this.id = id;
        this.tipo = tipo;
        this.apartamento = apartamento;
        this.condominio = condominio;
        this.secretaria = secretaria;
        this.veiculo = veiculo;
        this.visita = visita;
    }

    public Morador(Integer id, String tipo, Apartamento apartamento, Condominio condominio, Secretaria secretaria, Veiculo veiculo, Visitante visita) {
        this.id = id;
        this.tipo = tipo;
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

    public Morador() {
 
    }
    /*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    }*/
   
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
