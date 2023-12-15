
package com.pi.manag.entitie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;





public class ReservaEspaco{
    private int id;
    private Morador morador;
    private Espaco espaco;
    private LocalDateTime data;
    private int horario;

    public ReservaEspaco(int id, Morador morador, Espaco espaco) {
        this.id = id;
        this.morador = morador;
        this.espaco = espaco;
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

    public int getHorario() {
        return horario;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void reservarEspaco(int dia, int mes,int ano,int horario){
        this.data=LocalDateTime.of(ano, mes, dia, this.horario=horario, 00);
        
    }
    public void mostrarDataReserva(){
        DateTimeFormatter  padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        espaco.mostrarDadosEspaco();
        System.out.print("reservado para data:..");
        System.out.println(this.data.format(padrao));
       // morador.mostrarMorador();
    }

   
    
    
    
}
