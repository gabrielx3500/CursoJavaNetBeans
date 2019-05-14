
import java.util.*;
public class BuscarNumeroEnArreglo {

   
    public static void main(String[] args) {
      //Declaramos un array
       int array[]={7,4,2,100,8,0,9,5,120,300}; 
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingtrese el numero a buscar: ");
       int n = sc.nextInt();
       if(buscarNumero(n,array))
       {
         System.out.println("El numero se encontro.");  
       } 
       else
       {
         System.out.println("El numero no se encontro");  
       }   
        
    }
    //Declaramos un metodo
    public static boolean buscarNumero(int n,int arr[])
    {
      int cont = 0;
      int k = 0;
      boolean encontrado = false;
      for(int i=0;i<arr.length;i++)
      {
        if(n==arr[i]) 
        {
          cont++;
        }
        if(cont>0)
        {
          k++;
          System.out.println("Veces que se busco el Numero: " + k);
          encontrado = true; 
          break;
        }
        else
        {
          encontrado = false;  
        }
      }
      return encontrado;
    }
    
}
