
/**
 *
 * @author gabriel
 */
import javax.swing.*;
import java.awt.*;
public class Ventanas2 extends JFrame {
    //declaramos un constructor
    public Ventanas2()
    {
        super("Ventana de demostracion");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container miPanel = getContentPane();
        miPanel.setLayout(new FlowLayout());
        JButton boton = new JButton("Java, Hola!");
        miPanel.add(boton);
        JButton boton2 = new JButton("Segundo boton");
        miPanel.add(boton2);
        JButton boton3 = new JButton("Tercer boton");
        miPanel.add(boton3);
        //Etiqueta de texto
        JLabel texto = new JLabel("Hola Java, mi Primera etiqueta!");
        miPanel.add(texto);
        //Cuadro de texto
        JTextField etiqueta = new JTextField(20);//Nuemro de caracteres que permite
        miPanel.add(etiqueta);
    }       
    
}
