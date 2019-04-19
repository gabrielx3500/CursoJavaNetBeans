
/**
 *
 * @author gabriel
 */
import javax.swing.*;
public class MiVentana extends JFrame {
    //Declaramos un constructor publico
    public MiVentana()
    {
       JLabel eti = new JLabel("Hola, hola Java!");
       setSize(400,400);
       add(eti);
       setVisible(true);
       
    }       
    
}
