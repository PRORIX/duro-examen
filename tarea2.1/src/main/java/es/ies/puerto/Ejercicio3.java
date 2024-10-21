package es.ies.puerto;

public class Ejercicio3 {
    static private Coche coche;
    public static void main(String[] args) {
        coche = new Coche("Toyota", "Corolla", 2022);
        coche.mostrarDatosCoche();
    }
}