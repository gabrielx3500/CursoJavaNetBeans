/**
 *
 * @author gabriel
 */
import javax.swing.*;
public class CuadrosDeTexto extends JFrame {

    public CuadrosDeTexto(){
        JTextField ct = new JTextField("Introduce algo aqui: ");
        ct.setBounds(200,200,180,60);
        add(ct);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
  
    public static void main(String[] args) {
        //Creamos una instancia de CuadrosDeTexto
        CuadrosDeTexto  campo = new CuadrosDeTexto();
    }
    
}
