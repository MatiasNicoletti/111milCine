
package cine;


public class PaisOrigen {

    private  String idioma;
    private String nombre;
    
    public PaisOrigen(){
    }  
    public PaisOrigen(String idioma, String nombre) {
        this.idioma = idioma;
        this.nombre = nombre;
    }
    
    public String getIdioma() {
        return idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
