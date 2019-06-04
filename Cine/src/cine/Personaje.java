
package cine;


public class Personaje {

    private Actor actor;
    private Rol rol;

    public Personaje() {
    }

    public Personaje(Actor actor, Rol rol) {
        this.actor = actor;
        this.rol = rol;
    }
    
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
