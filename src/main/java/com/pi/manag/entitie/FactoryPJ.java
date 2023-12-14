package com.pi.manag.entitie;



/**
 *
 * @author soluc
 */
public class FactoryPJ extends FactoryPessoaJuridica {

    @Override
    public Pessoa gerarPessoaJuridica(byte op) {
        switch(op){
            case 1:
                return new Condominio();
            case 2:
                return new Empresa();
            default:
                return null;
        }
    }
   
}
