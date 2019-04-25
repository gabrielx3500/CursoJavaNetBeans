import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Eventos extends JFrame{
   public Eventos(){
     JLabel pideMensaje = new JLabel("Dime algo...!"); 
     pideMensaje.setBounds(35,20,200,30);
     JTextField campo = new JTextField(150);
     campo.setBounds(35,140,150,30);
     JButton boton = new JButton("Da Click");
     boton.setBounds(35,140,150,30);
     JLabel muestraMensaje = new JLabel();
     muestraMensaje.setBounds(50,200,250,50);
     ActionListener escuchador = new  ActionListener(){
     
         
         public void actionPerformed(ActionEvent e)
         {
           muestraMensaje.setText("Dijiste esto: " + campo.getText());  
         }
         
     };
     
     boton.addActionListener(escuchador);
     add(muestraMensaje);
     add(pideMensaje);
     add(boton);
     add(campo);
     setSize(400,400);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     
   }
   
    public static void main(String[] args) {
     Eventos eventos = new Eventos();
    }
    
}
