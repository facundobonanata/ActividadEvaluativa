package com.ejercicios.uy;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        int sueldo = Integer.parseInt(captura.nextLine());
        System.out.println("Ingrese su area de trabajo: ");
        String area = captura.nextLine();
        System.out.println("Ingrese numero de hijos: ");
        String hijos = captura.nextLine();
        double sueldoTotal;
        if (area == "Sistemas"){   //cambiar a switch//
            sueldoTotal = sueldo +(sueldo * 0.25);
            System.out.println("Su sueldo es de " + sueldoTotal);
        }else if(area =="Contabilidad"){
            sueldoTotal = sueldo +(sueldo * 0.20);
            System.out.println("Su sueldo en contabilidad es de " + sueldoTotal);
        }else{
            sueldoTotal = sueldo +(sueldo * 0.10);
            System.out.println("Su sueldo en esa area es de :" + sueldoTotal);
        }



    }
}
