package com.pi.manag.entitie;




/**
 *
 * @author soluc
 */
public class FactoryPF extends FactoryPessoaFisica{
    
    
    @Override
    public Pessoa getPessoaFisica(byte op,int id,String nome, String sexo, String rg) {
        switch(op){
            case 1:
                return new Morador(id, sexo, rg, nome);
                //return new Morador();
            case 2:
               return new Visitante(id, sexo, rg, nome);
                //return new Visitante();
            case 3:
                return new Secretaria(id, sexo, rg, nome);
               // return new Secretaria();
            case 4:
                return new Funcionario(id, sexo, rg, nome);
               // return new Funcionario();
            default:
                return null;
        }
    }
    
}
