
package paq1;

public class Persona {
    //Declaramos los atributos de la clase Persona
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    
    //Metodos de acceso: Setters y Getters
    public void dameNombre(String nom)
    {
       nombre = nom; 
    }
    public String devuelveNombre()
    {
        return nombre;
    }
    
    public void dameApellido(String ape)
    {
        apellido = ape;
    }
    
    public String devuelveApellido()
    {
        return apellido;
    }
    
    public void dameGenero(String gen)
    {
        genero = gen;
    }
    
    public String devuelveGenero()
    {
        return genero;
    }       
}
