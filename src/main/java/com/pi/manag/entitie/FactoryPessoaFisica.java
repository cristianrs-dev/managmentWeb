
package com.pi.manag.entitie;




/**
 *
 * @author soluc
 */
public abstract class FactoryPessoaFisica {
    public abstract Pessoa getPessoaFisica(byte op,int id,String nome, String sexo, String rg);
}
