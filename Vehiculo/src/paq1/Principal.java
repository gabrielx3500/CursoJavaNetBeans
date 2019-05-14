
package paq1;


public class Principal {
    
    
    public static void main(String[] args){
        Vehiculo micarro = new Vehiculo();
        micarro.acelerar(12);
        micarro.frenar(4);
        
        //Mostramos la velocidad
        System.out.println(micarro.obtenerVelocidad());
    }
}
