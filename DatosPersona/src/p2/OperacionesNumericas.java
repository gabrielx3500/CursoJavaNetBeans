
package p2;

import java.util.*;
public class OperacionesNumericas {
    double num1,num2;
    double suma,resta;
    
    public void pideNumeros(){
       Scanner ob = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       num1 = (int) ob.nextDouble();
       System.out.println("Ingrese un numero: ");
       num2 = ob.nextDouble();
    }
    public void suma(){
        suma = num1+num2;
    }
    
    public void resta(){
        resta = num1-num2;
    }
    //Metodo que visualice las suma y la resta
    public void muestraResultados(){
        System.out.println("El resultado de la Suma es: " + suma);
        System.out.println("El resultado de la Resta es: " + resta);
    }
}
