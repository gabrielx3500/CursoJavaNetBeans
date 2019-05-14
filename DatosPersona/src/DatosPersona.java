/*
 * Crear un método que pida ingresar datos, y otro método para mostrarlos en pantalla.

 */

import java.util.*;
public class DatosPersona {
//Declaramos variables
    String nombre, estadoCivil;
    int edad;
    
    public void leerDatos(){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Escribe el nombre: ");
      nombre = teclado.nextLine();
      System.out.println("Escribe la Edad: ");
      edad = teclado.nextInt();
      System.out.println("Escribe el Estado Civil: ");
      estadoCivil = teclado.next();
    }
   
    public void mostrarDatos(){
        System.out.println("Su nombres es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su estado civil es: " + estadoCivil);
    }
    
}
