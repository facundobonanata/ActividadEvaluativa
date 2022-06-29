package com.ejercicios.uy;

public class Profesor extends Persona {
    private static String materias [] = {"Matematicas","Filosofia","Fisica"};
    private String materia;

    public Profesor(String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
    }
}
