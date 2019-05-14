
package p3;

import javax.swing.JOptionPane;
public class DatosAlumnos {
    //Declaramos variables
    String nombre;
    double calificacion;
    
    public void pideDatos(){
        nombre = JOptionPane.showInputDialog(null,"Ingresa el Nombre del Alumno:");
        calificacion = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la calificacion:"));
        
        
    }
    public void estado(){
        if(calificacion>=6){
            JOptionPane.showMessageDialog(null,"El Alumno esta aprobado");
        }
        else{
            JOptionPane.showMessageDialog(null,"El Alumno esta reprobado");
        }
    }
    public void muestraDatos(){
        JOptionPane.showMessageDialog(null, "El Nombre es: " + nombre);
        JOptionPane.showMessageDialog(null,"La calificacion es: " + calificacion);
    }
}
