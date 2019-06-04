
package cine;

import java.util.ArrayList;
import java.util.Date;


public class Cine {
    private String direccion;
    private Date fechaInauguracion;
    private String nombre;
    private Float precioEntrada;
    private ArrayList<Programacion> programacion;
    private ArrayList<HorarioFuncion> horarioFunciones;
    private ArrayList<Sala> salas;

    public Cine() {
        programacion = new ArrayList<>();
        horarioFunciones = new ArrayList<>();
        salas = new ArrayList<>();
    }

    public Cine(String direccion, Date fechaInauguracion, String nombre, Float precioEntrada, ArrayList<Programacion> programacion, ArrayList<HorarioFuncion> horarioFunciones, ArrayList<Sala> salas) {
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
        this.programacion = programacion;
        this.horarioFunciones = horarioFunciones;
        this.salas = salas;
    }

    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaInauguracion() {
        return fechaInauguracion;
    }

    public void setFechaInauguracion(Date fechaInauguracion) {
        this.fechaInauguracion = fechaInauguracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Programacion> getProgramacion() {
        return programacion;
    }

    public void setProgramacion(ArrayList<Programacion> programacion) {
        this.programacion = programacion;
    }

    public ArrayList<HorarioFuncion> getHorarioFunciones() {
        return horarioFunciones;
    }

    public void setHorarioFunciones(ArrayList<HorarioFuncion> horarioFunciones) {
        this.horarioFunciones = horarioFunciones;
    }
    
    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    public String mostrarInfoHorariosFuncion(){
        
        return " " + this.getHorarioFunciones();
    }
    
    public String mostrarCine(){
        return " " + this.getDireccion() + this.getNombre() + this.getFechaInauguracion() + this.getHorarioFunciones()
                + this.getPrecioEntrada() + this.getProgramacion() + this.getSalas();
        
    }
    
}
