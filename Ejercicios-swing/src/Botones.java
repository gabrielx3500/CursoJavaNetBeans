

/**
 *
 * @author gabriel
 */
import javax.swing.*;
public class Botones extends JFrame {
    //Declaramos el constructor
    public Botones()
    {
        JButton boton = new JButton("Dale Click...!");
        setSize(500,500);
        boton.setBounds(200,200,180,80);
        add(boton);//Agregamos el boton
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String[] args){
        Botones vt1 = new Botones();
    }
}
