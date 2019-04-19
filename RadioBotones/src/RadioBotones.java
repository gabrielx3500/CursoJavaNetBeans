

/**
 *
 * @author gabriel
 */
import javax.swing.*;

public class RadioBotones extends JFrame{

   public RadioBotones(){
       super("Ejemplo de radio Botones");
     JRadioButton radio = new JRadioButton("Rojo",true);
     JRadioButton radio2 = new JRadioButton("Azul",false);
     JRadioButton radio3 = new JRadioButton("Verde",false);
     radio.setBounds(40,80,80,40);
     radio2.setBounds(40,120,80,40);
     radio3.setBounds(40,160,80,40);
     add(radio);
     add(radio2);
     add(radio3);
     setSize(450,450);
     setLayout(null);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        RadioBotones ct = new RadioBotones();
    }
    
}
