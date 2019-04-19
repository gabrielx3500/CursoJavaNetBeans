
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
import javax.swing.*;
public class Ventanas extends JFrame{
    
            // TODO code application logic here
        //Creamos un constructor
         public Ventanas()
         {
         super("Demostracion del JFrame en Java");
         setSize(450,350);//Tamaño de l aventana
         setLocation(135,156);//Posicion de en la pantalla de acuerdo a un eje de coordenadas x,y
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);//No permito la Re-direccion
         }
    }
    
