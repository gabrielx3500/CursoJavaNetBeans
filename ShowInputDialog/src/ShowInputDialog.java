/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
import javax.swing.JOptionPane;
public class ShowInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //Metodo ShowInputDialog
        /*
        String numero = JOptionPane.showInputDialog("Ingrese un Valor: ");
        Integer.parseInt(numero);
        //Mostramos el valor Introducido con otra ventana de Dialogo
        JOptionPane.showMessageDialog(null,"El Valor ingresado es: " + numero);*/
        //Otro ejemplo del ShowInputDialog es el siguiente
        /*
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Valor: "));
        JOptionPane.showMessageDialog(null,"El Valor ingresado es: " + numero);*/
        //Otro ejemplo
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor 1: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Valor 2: "));
        int suma = numero1+numero2;
        //Mostyramos resultado
        JOptionPane.showMessageDialog(null,"El Valor de la Suma es:  " + suma);
    }
    
}
