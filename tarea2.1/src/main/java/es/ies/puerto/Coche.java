package es.ies.puerto;

public class Coche {
    String marca;
    String modelo;
    int anio;
    public Coche() {}

     /**
      * 
      * @param marca
      * @param modelo
      * @param anio
      */

     public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;

     }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }

    /**
     * Método que muestra la información de la persona
     */

     public void mostrarDatosCoche() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
     }

    
}
