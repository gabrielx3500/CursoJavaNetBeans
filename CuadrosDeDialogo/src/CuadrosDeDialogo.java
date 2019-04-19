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
public class CuadrosDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Construccion del ShowMessage Dialogo
        //Ejemplos
        JOptionPane.showMessageDialog(null,"Este es mi Primer Sistema");//JOptionPane con un solo mensaje
        JOptionPane.showMessageDialog(null,"Sistema Activado","Información al Usuario",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sistema Activado","Información al Usuario",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"Sistema Activado","Información al Usuario",JOptionPane.PLAIN_MESSAGE);
        
       
    }
    
}
