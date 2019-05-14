
package paq1;

public class Principal{
  public static void main(String[] args)
  {
      //Creamos instancias de la clase gato
      Gato gato1 = new Gato();
      gato1.nombre = "Firulais";
      gato1.edad = 2;
      gato1.peso= 2.2;
      gato1.colorOjos = "Azules";
      Gato gato2 = new Gato();
      gato2.nombre = "Cuco";
      gato2.edad = 1;
      gato2.peso = 2.5;
      gato2.colorOjos = "Verdes";
      //Mostramos datos por pantalla
      System.out.println("Caracteristicas del Objeto 1:");
      System.out.println("Nombre: " + gato1.nombre + "\n" + "Edad: " + gato1.edad + "\n" + "Peso: " + gato1.peso + "\n" + "Color de ojos: " + gato1.colorOjos + "\n" );
      System.out.println("Caracteristicas del Objeto 2:");
      System.out.println("Nombre: " + gato2.nombre + "\n" + "Edad: " + gato2.edad + "\n" + "Peso: " + gato2.peso + "\n" + "Color de ojos: " + gato2.colorOjos + "\n" );
  }
}

