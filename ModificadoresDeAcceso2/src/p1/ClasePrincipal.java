
package p1;


public class ClasePrincipal {

   
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        
        alumno1.dameNombreCompleto("Gabriel");
        alumno2.dameNombreCompleto("Arturo");
        alumno3.dameNombreCompleto("Felix");
        alumno4.dameNombreCompleto("Daniel");
        
        alumno1.dameNumeroControl("234");
        alumno2.dameNumeroControl("235");
        alumno3.dameNumeroControl("236");
        alumno4.dameNumeroControl("237");
        
        alumno1.dameCalificacion(5);
        alumno2.dameCalificacion(5.8);
        alumno3.dameCalificacion(3.56);
        alumno4.dameCalificacion(8);
        
       System.out.println("Datos del Alumno 1: " + alumno1.devuelveNombreCompleto() + "\n" + "Num. Control: " + "\n" + alumno1.devuelveNumeroControl() + "\n" + "Calificacion: " + alumno1.devuelveCalificacion());
       System.out.println("Datos del Alumno 1: " + alumno2.devuelveNombreCompleto() + "\n" + "Num. Control: " + "\n" + alumno2.devuelveNumeroControl() + "\n" + "Calificacion: " + alumno2.devuelveCalificacion());
       System.out.println("Datos del Alumno 1: " + alumno3.devuelveNombreCompleto() + "\n" + "Num. Control: " + "\n" + alumno3.devuelveNumeroControl() + "\n" + "Calificacion: " + alumno3.devuelveCalificacion());
       System.out.println("Datos del Alumno 1: " + alumno4.devuelveNombreCompleto() + "\n" + "Num. Control: " + "\n" + alumno4.devuelveNumeroControl() + "\n" + "Calificacion: " + alumno4.devuelveCalificacion());
       
        
        
    }
    
}
