import javax.swing.*;
public class EjemploLayout extends JFrame {

    //Creamos constructor
    public EjemploLayout(){
        JPanel panel = new JPanel();
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");
        JButton boton5 = new JButton("Boton 5");
        JButton boton6 = new JButton("Boton 6");
        JButton boton7 = new JButton("Boton 7");
        JButton boton8 = new JButton("Boton 8");
        //Agregamos los botones al Panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        panel.add(boton8);
        //Asociamos el Panewl al JFrame
        getContentPane().add(panel);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        EjemploLayout ejemplo = new EjemploLayout();
    }
    
}
