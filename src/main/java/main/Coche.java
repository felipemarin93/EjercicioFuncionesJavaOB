package main;

public class Coche {
    int cantidadPuertas=2;


    public void incrementarPuertas(int numeroASumar){
        cantidadPuertas = cantidadPuertas+numeroASumar;
        System.out.println("El coche ahora tiene:  " + cantidadPuertas + " puertas");
    }
}
