import javax.swing.*;
public class ComboBox extends JFrame {

    public ComboBox(){
        String[] comidas = {"Pizza","Hamburguesa","Sushi","Tacos","Parrilla"};
        
        
        JComboBox combo = new JComboBox(comidas);
        combo.setBounds(60,60,100,100);
        add(combo);
        combo.addItem("Seviche");//Agrega elementos
        combo.setSelectedItem("Tacos");
        setLayout(null);
        setBounds(100,100,450,450);//metodo del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        ComboBox combo = new ComboBox();
    }
    
}
