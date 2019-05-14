/*
 * Ejemplo de metodos sin parametros
 
 */


public class MetodoSinParametros {
//Declaramos una variable
    int edad = 65;
    String nombre = "Gabriel";

    public static void main(String[] args) {
        MetodoSinParametros ob = new MetodoSinParametros();
        System.out.println("La edad es: " +ob.mostrandoEdad());
        System.out.println("El Nombre es: " +ob.mostrandoNombre());
    }
    
    int mostrandoEdad(){
        return edad;
    }
    String mostrandoNombre(){
        return nombre;
    }
    
}
