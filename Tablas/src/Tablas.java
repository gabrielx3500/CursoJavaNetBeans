
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPane;
public class Tablas extends JFrame {
    //Creamos el constructor
  
   public Tablas(){
      super("Mi tabla");
      DefaultTableModel modelo = new DefaultTableModel();
      //asi agregaamos columnas
      modelo.addColumn("Nombre");
      modelo.addColumn("Edad");
      modelo.addColumn("Nacionalidad");
      modelo.addColumn("Telefonos");
      //Creamos arreglos
      String[]p1={"Pepe","20","Mexicana","4979479"};
      String[]p2={"Juan","40","Español","5555555"};
      String[]p3={"Lupe","18","Argentina","8568568"};
      String[]p4={"Maria","18","Mexicana","9547473"};
      //creamos las filas
      modelo.addRow(p1);
      modelo.addRow(p2);
      modelo.addRow(p3);
      modelo.addRow(p4);
      
      JTable tabla = new JTable(modelo);
      JScrollPane scroll = new JScrollPane(tabla);
      tabla.setBounds(12,22,500,500);//Dimensiones de la tabla
      setSize(750,700);
      scroll.setBounds(12,22,500,500);
      add(scroll);
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }

    public static void main(String[] args) {
        Tablas ct = new Tablas();
    }
    
}
