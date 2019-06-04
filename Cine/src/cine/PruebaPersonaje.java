/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */

/*
Clase hecha para el testeo de personajes
    
*/
public class PruebaPersonaje {
    private ArrayList<Personaje> personajes = new ArrayList<>();
    private Personaje p;

    public PruebaPersonaje() {
        
    }
    // A Star Is born
    public void setPersonaje1(){
        p = new Personaje(new Actor(false, "Bradley", "Cooper", new Sexo("Masculino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Lady", "Gaga", new Sexo("Femenino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Sam", "Elliot", new Sexo("Masculino")), new Rol("Reparto"));
        personajes.add(p);
    }
    // Mad Max
    public void setPersonaje2(){
        p = new Personaje(new Actor(false, "Tom", "Hardy", new Sexo("Masculino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Charlize", "Theron", new Sexo("Femenino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Zoe", "Kravitz", new Sexo("Femenino")), new Rol("Reparto"));
        personajes.add(p);
    }
    // El Angel
    public void setPersonaje3(){
        p = new Personaje(new Actor(false, "Chino", "Darin", new Sexo("Masculino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Lorenzo", "Ferro", new Sexo("Masculino")), new Rol("Principal"));
        personajes.add(p);
        
        p = new Personaje(new Actor(false, "Malena", "Villa", new Sexo("Femenino")), new Rol("Reparto"));
        personajes.add(p);
    }
    
    
    
    public ArrayList<Personaje> getPersonajes() {
       // System.out.println("\n -------------------------------------- \nPersonajes ->> " + personajes.toString());
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Personaje getP() {
        return p;
    }

    public void setP(Personaje p) {
        this.p = p;
    }
    
    
}
