
package cine;

import java.util.Date;


public class Entrada {
    private Date fechaHoraFuncion;
    private Date fechaHoraVentas;
    private Float precioCobrado;
    private int ticketNro;
    private Funcion funcion;
    
    private boolean anulada;
    
    public Entrada() {
    }

    public Entrada(Date fechaHoraFuncion, Date fechaHoraVentas, Float precioCobrado, int ticketNro, Funcion funcion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVentas = fechaHoraVentas;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.funcion = funcion;
        
        this.anulada = false;
    }
    
    
    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVentas() {
        return fechaHoraVentas;
    }

    public void setFechaHoraVentas(Date fechaHoraVentas) {
        this.fechaHoraVentas = fechaHoraVentas;
    }

    public Float getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(Float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
    
    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    
    public void setAnulada(boolean b){
        this.anulada = b;
    }
    
    public boolean estaAnulada(){
        return this.anulada;
    }
}
