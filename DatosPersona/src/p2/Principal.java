
package p2;


public class Principal extends OperacionesNumericas{
    
    public static void main(String[] args){
      OperacionesNumericas op = new OperacionesNumericas();
      op.pideNumeros();
      op.suma();
      op.resta();
      op.muestraResultados();  
    }

}
