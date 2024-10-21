package es.ies.puerto;

public class Persona {
    String nombre;
    int edad;
    public Persona() {}

    /**
     * Constructor con el nombre del objeto
     * @param nombre de la persona.
     */

     public Persona (String nombre) {
        this.nombre = nombre;
     }

     /**
      * 
      * @param edad
      * @param nombre
      */

     public Persona(int edad, String nombre) {
        this.nombre = nombre;
        this.edad = edad;
     }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que muestra la información de la persona
     */

     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
     }

     
}
