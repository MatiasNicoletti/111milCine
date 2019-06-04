
package cine;


public class Calificacion {
    private Integer id;
    private String nombre;

    public Calificacion() {
    }
    public Calificacion(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
}
