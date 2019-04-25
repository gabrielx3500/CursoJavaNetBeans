import javax.swing.*;
public class CrearLista extends JFrame{
    
    public CrearLista(){
        DefaultListModel<Empleado>modelo = new DefaultListModel<Empleado>();
        JList lista = new JList(modelo);
        lista.setBounds(12,12,210,310);
        modelo.addElement(new Empleado("Juan","Cocinero",2000));
        modelo.addElement(new Empleado("Mirian","Secretaria I",2500));
        modelo.addElement(new Empleado("Anna","Secretaria",2500));
        modelo.addElement(new Empleado("Teresa","Rececionista",2000));
        modelo.addElement(new Empleado("Alba","Cajera",2000));
        modelo.addElement(new Empleado("Rodrigo","Bartender",2300));
        modelo.addElement(new Empleado("Carlos","Bartender",2300));
        modelo.addElement(new Empleado("Regulo","Chofer",2800));
        modelo.addElement(new Empleado("Adriana","Cocinero",2000));
        modelo.addElement(new Empleado("Carlota","Cocinero",2000));
        modelo.addElement(new Empleado("Yenny","Contadora",3000));
        modelo.addElement(new Empleado("Dario","Publiscista",3000));
        modelo.addElement(new Empleado("Ernesto","Cocinero",2000));
        modelo.addElement(new Empleado("Hugo","Cocinero",2000));
        modelo.addElement(new Empleado("Maria","Cocinero",2000));
        modelo.addElement(new Empleado("Rosa","Cocinero",2000));
         modelo.addElement(new Empleado("Juan","Cocinero",2000));
        modelo.addElement(new Empleado("Mirian","Secretaria I",2500));
        modelo.addElement(new Empleado("Anna","Secretaria",2500));
        modelo.addElement(new Empleado("Teresa","Rececionista",2000));
        modelo.addElement(new Empleado("Alba","Cajera",2000));
        modelo.addElement(new Empleado("Rodrigo","Bartender",2300));
        modelo.addElement(new Empleado("Carlos","Bartender",2300));
        modelo.addElement(new Empleado("Regulo","Chofer",2800));
        modelo.addElement(new Empleado("Adriana","Cocinero",2000));
        modelo.addElement(new Empleado("Carlota","Cocinero",2000));
        modelo.addElement(new Empleado("Yenny","Contadora",3000));
        modelo.addElement(new Empleado("Dario","Publiscista",3000));
        modelo.addElement(new Empleado("Ernesto","Cocinero",2000));
        modelo.addElement(new Empleado("Hugo","Cocinero",2000));
        modelo.addElement(new Empleado("Maria","Cocinero",2000));
        modelo.addElement(new Empleado("Rosa","Cocinero",2000));
        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(12,12,210,310);
        add(scroll);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     
        
    }
    
    public static void main(String[] args) {
       CrearLista ml = new CrearLista();
    }
    
}
