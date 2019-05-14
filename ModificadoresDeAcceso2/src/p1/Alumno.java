
package p1;


public class Alumno {
  private String nombreCompleto;
  private String numControl;
  private double calificacion;
  
  //Declaramos los metodos getter y setter
  public void dameNombreCompleto(String nombreCompleto)
  {
      this.nombreCompleto = nombreCompleto;
      //Con this. estoy diciendo que nombreCompleto
      //es el mismo atributo
  }
  
  public String devuelveNombreCompleto()
  {
      return nombreCompleto;
  }
  
    public void dameNumeroControl(String numControl)
  {
      this.numControl = numControl;
      //Con this. estoy diciendo que nombreCompleto
      //es el mismo atributo
  }
  
  public String devuelveNumeroControl()
  {
      return numControl;
  }
  
  public void dameCalificacion(double calificacion)
  {
      this.calificacion = calificacion;
      //Con this. estoy diciendo que nombreCompleto
      //es el mismo atributo
  }
  
  public double devuelveCalificacion()
  {
      return calificacion;
  }
  
  
  
}
