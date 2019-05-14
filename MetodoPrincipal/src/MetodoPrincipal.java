/*
 * Ejemplo de un metodo sin parametros
 * 
*/


public class MetodoPrincipal {

 
    public static void main(String[] args) {
        MetodoPrincipal ob = new MetodoPrincipal();//Obejto de tipo principal
        ob.mostrarMensaje();//Llamamos al metodo
        ob.mostrarMensaje2();
    }
    
    public void mostrarMensaje(){
        System.out.println("Este es mi Primer Metodo");
    }
    
    public void mostrarMensaje2(){
        System.out.println("Estee s mi Segundo metodo");
    }
    
}
