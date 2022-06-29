package com.ejercicios.uy;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = captura.nextInt();
        if(numero %2==0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }


    }
}
