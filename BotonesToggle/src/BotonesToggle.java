import javax.swing.*;
public class BotonesToggle extends JFrame{

   public BotonesToggle(){
     JToggleButton boton = new JToggleButton("Click",true);
     JToggleButton boton2 = new JToggleButton("Click",false);
        boton.setBounds(210,210,80,45);
        boton2.setBounds(320,210,80,45);
        add(boton);
        add(boton2);
        setBounds(150,150,450,450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
   }

    public static void main(String[] args) {
       BotonesToggle botones = new BotonesToggle();
    }
    
}
