
package cine;

import java.util.ArrayList;
import java.util.Date;


public class Pelicula {

    private int agnoEstreno;
    private boolean disponible;
    private int duracion;
    private Date fechaIngreso;
    private String nombre;
    private String tituloOriginal;
    private PaisOrigen pais;
    private Genero genero;
    private Calificacion calificacion;
    private ArrayList<Personaje> personajes;
    private ArrayList<Funcion> funciones;
        
    public Pelicula(){
        personajes = new ArrayList<>();
        funciones = new ArrayList<>();
    }

    public Pelicula(int agnoEstreno, boolean disponible, int duracion, Date fechaIngreso, String nombre, String tituloOriginal, PaisOrigen pais, Genero genero, Calificacion calificacion, ArrayList<Personaje> personajes, ArrayList<Funcion> funciones) {
        this.agnoEstreno = agnoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
        this.pais = pais;
        this.genero = genero;
        this.calificacion = calificacion;
        this.personajes = personajes;
        this.funciones = funciones;
    }
    
    public int getAgnoEstreno() {
        return agnoEstreno;
    }

    public void setAgnoEstreno(int agnoEstreno) {
        this.agnoEstreno = agnoEstreno;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public PaisOrigen getPais() {
        return pais;
    }

    public void setPais(PaisOrigen pais) {
        this.pais = pais;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void recorrerArray(){
        for(Personaje i: this.personajes){
            System.out.println("" + i.getActor().getApellido() + ", " + i.getActor().getNombre());
        }

    }
    
    public boolean estaEnCartelera(){
        return !this.funciones.isEmpty();
    }
    
    public String mostrarFuncionesHabilitadas(){
        
        return funciones.toString();
    }
    
    public int calcularDuracionEnFuncion(){
        HorarioFuncion f = new HorarioFuncion();
        
        return (int) (this.duracion + f.getDuracionIntervalo() + f.getDuracionPublicidad());
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "Titulo Original: " + this.getTituloOriginal() + "Año: " + this.getAgnoEstreno() + 
                "Fecha " + this.getFechaIngreso() + "Duracion " + getDuracion() + "Disponible " + estaDisponible() + 
                "Pais: " + pais.getNombre() + "Genero: " + genero.getNombre() + "Calificacion: " + calificacion.getNombre() 
                + "Personajes: " + personajes.toString() + "Funciones: " + funciones.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
