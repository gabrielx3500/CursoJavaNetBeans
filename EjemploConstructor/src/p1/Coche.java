
package p1;

public class Coche {
    //Atributos de la clase coche
    private String color;
    private double precio;
    private int antiguedad;
    
    public Coche(String col, double pre, int anti)
    {
     this.color = col;
     this.precio = pre;
     this.antiguedad = anti;
    }
    
    public String getColor()
    {
       return color; 
    }
    
    public double getPrecio()
    {
       return precio; 
    }  
    
    public int getAntiguedad()
    {
      return antiguedad;  
    }      
    
    
}
