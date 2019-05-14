
package p1;


public class ClasePrincipal {

   
    public static void main(String[] args) {
       Coche c1 = new Coche("Azul",2800,4);
       Coche c2 = new Coche("Blanco",4567,32);
       Coche c3 = new Coche("Verde",12345,3);
       
       //Mostrar datos
       System.out.println("Datos del Coche 1: " + c1.getColor() + "\n" + c1.getPrecio() + "\n" + c1.getAntiguedad());
   
    }
    
}
