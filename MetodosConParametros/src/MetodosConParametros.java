/*
 * Metodos con Parametros
*/


public class MetodosConParametros {
//Declaramos variables
    int edad = 38;
   
    public static void main(String[] args) {
        MetodosConParametros ob = new MetodosConParametros();
        ob.mostrandoNombre("Gabriel");
        System.out.println("Mi edad es: " + ob.mostrandoEdad());
    }
    
    void mostrandoNombre(String nom){
        System.out.println("El Nombre es: " + nom);
    }
    int mostrandoEdad(){
        return edad;
    }
    
}
