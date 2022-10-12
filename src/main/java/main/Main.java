package main;

public class Main {

    public static void principal(String[] args){
        int resultado;
        resultado = suma(15,20,10);
        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.incrementarPuertas(1);

        }
    public static int suma(int numeroUno,int numeroDos,int numeroTres){
        return numeroUno+numeroDos+numeroTres;
    }
}
