
package cine;

import java.util.ArrayList;
import java.util.Date;


public class Programacion {
    private Date fechaFin;
    private Date fechaHoraCreada;
    private Date fechaInicio;
    private ArrayList<Funcion> funciones;
    private boolean vigente;

    
    
    public Programacion() {
        funciones = null;
        vigente = false;
    }

    public Programacion(Date fechaFin, Date fechaHoraCreada, Date fechaInicio, ArrayList<Funcion> funciones, boolean vigente) {
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
        this.funciones = funciones;
        this.vigente = vigente;
    }

    
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaHoraCreada() {
        return fechaHoraCreada;
    }

    public void setFechaHoraCreada(Date fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    public boolean estaVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }
    
    public boolean estaCompleta(){
        for(Funcion f : funciones){
            if(f.calcularDisponibilidad()>0){ //si tengo mas de cero entradas, no esta completa
                return false;
            }   
        }
        return true;
    }
    
    public int estaIniciadaFuncion(){
        return fechaInicio.compareTo(new Date()); //0 si no esta iniciada, 1 si esta iniciada
    }
    
    public String mostrarProgramacion() {
        return super.toString(); 
    }
    
}
