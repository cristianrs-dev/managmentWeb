package com.pi.manag.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
     @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
}
