
public class Empleado {
    //Variables
    String nombre, puesto;
    double sueldo;
    
    //Constructor
    public Empleado(String nombre, String puesto, double sueldo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public String toString(){
        return this.nombre;
    }
}
