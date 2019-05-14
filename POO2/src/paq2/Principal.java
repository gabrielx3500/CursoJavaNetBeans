
package paq2;


public class Principal extends Coche {
    public static void main(String[] args){
        
    
        
        Coche c1 = new Coche();
        Coche c2 = new Coche();
        Coche c3 = new Coche();
        c1.color = "Azul";
        c1.modelo = "RTWEESDFRE";
        c1.precio = 34000;
        c2.color = "Rojo";
        c2.modelo = "DFRE3400";
        c2.precio = 44000;
        c3.color = "Blanco";
        c3.modelo = "WEE23E";
        c3.precio = 14000;
        //Llamamos a los metodos
        c1.Avanzar();
        c1.Frenar();
        c1.Retroceder();
         //Mostramos datos por pantalla
      System.out.println("Caracteristicas del Objeto 1:");
      System.out.println("Color: " + c1.color + "\n" + "Modelo: " + c1.modelo + "\n" + "Precio: " + c1.precio + "\n");
      System.out.println("Caracteristicas del Objeto 2:");
      System.out.println("Color: " + c2.color + "\n" + "Modelo: " + c2.modelo + "\n" + "Precio: " + c2.precio + "\n");
      System.out.println("Caracteristicas del Objeto 3:");
      System.out.println("Color: " + c3.color + "\n" + "Modelo: " + c3.modelo + "\n" + "Precio: " + c3.precio + "\n");
        
        
    }
    
}
