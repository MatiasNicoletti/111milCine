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
 * @author Matias
 */
/*
Clase hecha para el testeo de peliculas
    
*/

public  class  PruebaPelicula {

    private Pelicula p;
    ArrayList<Personaje> a = new ArrayList<>();
    PruebaPersonaje x = new PruebaPersonaje();
    
    public PruebaPelicula() {

    }

    public void setPelicula1() {
        
        x.setPersonaje1();
        a = x.getPersonajes();
        p = new Pelicula(2015, true, 128, new Date(), "Nace una Estrella", "A Star Is Born", new PaisOrigen("Ingles", "EE.UU."), new Genero(1, "Drama"), new Calificacion("+16", 1), a, new ArrayList<>());

    }
    public void setPelicula2() {
        x.setPersonaje2();
        a = x.getPersonajes();
        p = new Pelicula(2015, true, 128, new Date(), "Mad Max", "Mad Max", new PaisOrigen("Ingles", "EE.UU."), new Genero(2, "Accion"), new Calificacion("+18", 1), a, new ArrayList<>());

    }
    public void setPelicula3() {
        x.setPersonaje3();
        a = x.getPersonajes();
        p = new Pelicula(2015, true, 128, new Date(), "El Angel", "The Angel", new PaisOrigen("Español", "Argentina"), new Genero(1, "Drama"), new Calificacion("+18", 1), a, new ArrayList<>());

    }

    public Pelicula getPelicula() {
        return p;
    }

    public void mostrarPelicula() {
        System.out.println("Nombre: " + p.getNombre() + "\nTitulo Original: " + p.getTituloOriginal() + "\nAño: " + p.getAgnoEstreno()
                + "\nFecha " + p.getFechaIngreso() + "\nDuracion " + p.getDuracion() + "\nDisponible " + p.estaDisponible()
                + "\nPais: " + p.getPais().getNombre() + p.getGenero().getNombre() + "\nCalificacion: " + p.getCalificacion().getNombre()
                + "\nFunciones: " + p.getFunciones().toString());
        
        for(Personaje i: p.getPersonajes()){
            System.out.println("" + i.getActor().getApellido() + ", " + i.getActor().getNombre());
        }

        System.out.println("<------------------------------------>\n");
    }
    public void mostrarPelicula(Pelicula p) {
        System.out.println("Nombre: " + p.getNombre() + "\nTitulo Original: " + p.getTituloOriginal() + "\nAño: " + p.getAgnoEstreno()
                + "\nFecha " + p.getFechaIngreso() + "\nDuracion " + p.getDuracion() + "\nDisponible " + p.estaDisponible()
                + "\nPais: " + p.getPais().getNombre() + p.getGenero().getNombre() + "\nCalificacion: " + p.getCalificacion().getNombre()
                + "\nFunciones: " + p.getFunciones().toString());
        
        for(Personaje i: p.getPersonajes()){
            System.out.println("" + i.getActor().getApellido() + ", " + i.getActor().getNombre());
        }
       
        System.out.println("<------------------------------------>\n");
    }
}
