package com.ejercicios.uy;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        /*System.out.println("Ingrese la cantidad de millas: ");
        int millas = captura.nextInt();
        double km = millas * 1.6093;
        double resultado = km;
        System.out.println(millas + " milla es igual a " + resultado + " km ");*/
            int millas;
            double km;
            do {
                System.out.print("Cantidad de millas:  ");
                millas = captura.nextInt();
                if (millas != 0) {
                    km = millas * 1.6093;
                    System.out.println(millas + " milla "+ "son " + km + " km " );
                }
                }while (millas !=0);
    }

}

