/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Funcion {
    private int diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    private Pelicula pelicula;
    private Sala sala;
    private ArrayList<Entrada> entradas;

    public Funcion(){
        entradas = new ArrayList<>();
    }

    public Funcion(int diaSemana, int duracion, Date horaInicio, int numero, Pelicula pelicula, Sala sala, ArrayList<Entrada> entradas) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.pelicula = pelicula;
        this.sala = sala;
        this.entradas = entradas;
    }
    
    
    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }
    
    public int calcularDisponibilidad(){
        return this.sala.getCapacidad() - this.entradas.size();
    }
    
    public int capacidadSala(){
        
        return this.sala.getCapacidad();
    }
    
    public int estaEnCurso(){
        return this.horaInicio.compareTo(new Date()); //retorna 0 si son iguales y 1 si la hora actual es superior a la hora de inicio
    }
    
    public boolean hayLugar(){
        return this.sala.getCapacidad() > this.entradas.size();
    }
    
    public String mostrarDiahora(){
        
        return " " + this.diaSemana + ", " + this.horaInicio;
    }
}
