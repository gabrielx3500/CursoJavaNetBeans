//eJEMPLO DE GETTERS Y SETTERS
package paq1;

public class ClasePrincipal {

    public static void main(String[] args) {
       Persona p1 = new Persona();
       Persona p2 = new Persona();
       Persona p3 = new Persona();
       
       p1.dameNombre("Gabriel");
       p2.dameNombre("Victor");
       p3.dameNombre("Anna");
       
       p1.dameApellido("Acosta");
       p2.dameApellido("Araujo");
       p3.dameApellido("Diaz");
       
       p1.dameGenero("MASCULINO");
       p2.dameGenero("MASCULINO");
       p3.dameGenero("FEMENINO");
       
       
       System.out.println("Datos de la Persona P1: " + p1.devuelveNombre() + "\n" + p1.devuelveApellido() + "\n" + p1.devuelveGenero());
       System.out.println("Datos de la Persona P2: " + p2.devuelveNombre() + "\n" + p2.devuelveApellido() + "\n" + p2.devuelveGenero());
       System.out.println("Datos de la Persona P3: " + p3.devuelveNombre() + "\n" + p3.devuelveApellido() + "\n" + p3.devuelveGenero());
       
       
      
    }
    
}
