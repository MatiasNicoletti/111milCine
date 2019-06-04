
package cine;

public class Genero {
    private Integer id;
    private String nombre;
    
    public Genero(){
    }
    public Genero(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }   
    
    public void setId(Integer id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Integer getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public String toString(){
        return id + nombre;
    }
}
