package com.ejercicios.uy;

public abstract class Persona {
      String nombre;
      String sexo;
      int edad;
      boolean asistencia;

    private final String[] Hombres={"Cris", "Fernando","Federico"};
    private final String[] Mujeres={"Lucia", "Maria", "Fernanda"};
    char Mujer=1;
    char Hombre=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}