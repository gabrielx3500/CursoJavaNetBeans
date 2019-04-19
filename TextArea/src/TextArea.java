
/**
 *
 * @author gabriel
 */
import java.awt.*;
import javax.swing.*;
public class TextArea extends JFrame{
//Creamos el constructor
    public TextArea(){
        super("Ejemplo de un JTextArea");
        JTextArea areaTexto = new JTextArea(8,8);
        JTextArea area2 = new JTextArea(8,8);
        areaTexto.setForeground(Color.BLUE);
        areaTexto.setSelectedTextColor(Color.red);
        areaTexto.setBackground(Color.black);
        area2.setForeground(Color.BLUE);
        area2.setSelectedTextColor(Color.yellow);
        area2.setBackground(Color.yellow);
        setBounds(250,250,400,400);
        add(areaTexto);
        add(area2);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
   
    public static void main(String[] args) {
       TextArea area = new TextArea();
    }
    
}
