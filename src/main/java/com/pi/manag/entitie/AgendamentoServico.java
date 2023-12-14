
package com.pi.manag.entitie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author soluc
 */
public class AgendamentoServico{
    private int id;
    private Morador morador;
    private Empresa empresa;
    private int horario;
    private LocalDateTime data;

    public AgendamentoServico(int id, Morador morador, Empresa empresa) {
        this.id = id;
        this.morador = morador;
        this.empresa = empresa;
    }

    public AgendamentoServico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public int getHorario() {
        return horario;
    }

    public LocalDateTime getData() {
        return data;
    }
    
    public void marcarDataHoraServico(int dia, int mes,int ano,int horario){
        this.data=LocalDateTime.of(ano, mes, dia,this.horario=horario, 00);
    }
    public void mostrarAutorizacaoServico(){
        DateTimeFormatter  padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.print("Servico autorizado para data:..");
        System.out.println(this.data.format(padrao));
        morador.mostrarMorador();
        empresa.mostrarEmpresa();
    }
}
