
import javax.swing.*;
public class Opciones extends JFrame{

      public Opciones(){
          DefaultComboBoxModel modelo = new DefaultComboBoxModel();
          JComboBox combo = new JComboBox(modelo);
          combo.setBounds(100,100,120,50);
          Empleado e1 = new Empleado();
          Empleado e2 = new Empleado();
          Empleado e3 = new Empleado();
          Empleado e4 = new Empleado();
          //Invocamos os metodos
          e1.setNombre("Carlos");
          e1.setPuesto("Supervisor");
          e1.setSueldo(2400);
          //Invocamos os metodos para el empleado 2
          e2.setNombre("Martin");
          e2.setPuesto("Operario");
          e2.setSueldo(1400);
          //Invocamos os metodos para el empleado 3
          e3.setNombre("Jose");
          e3.setPuesto("Chofer");
          e3.setSueldo(1200);
          //Invocamos os metodos para el empleado 4
          e4.setNombre("Augusto");
          e4.setPuesto("Mecanico");
          e4.setSueldo(1800);
          //Agregamos los modelos
          modelo.addElement(e1);
          modelo.addElement(e2);
          modelo.addElement(e3);
          modelo.addElement(e4);
          add(combo);
          setLayout(null);
          setBounds(200,200,600,600);//Tamaño del Frame
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setVisible(true);
          
          
      }
    public static void main(String[] args) {
        
       Opciones opciones = new Opciones();
    }
    
}
