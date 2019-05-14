
package paq1;


public class Vehiculo {
 private int numruedas;
 private double velocidad = 0;
 private String nombre;
 
 //Aumentar velocidad
 public void acelerar(double cantidad){
     velocidad+=cantidad;//velocidad+cantidad
 }    
 //Disminuir la velocidad
 public void frenar(double cantidad){
     velocidad-=cantidad; //velocidad-cantidad
 } 
 //Mostrar velocidad
 public double obtenerVelocidad(){
     return velocidad;
 }
    

     
 
    
    
    
}
