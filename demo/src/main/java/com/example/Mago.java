package com.example;

import com.example.Interfaces.Magico;

public class Mago extends Criatura implements Magico {
    private String hechizo;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.getDañoAdicional();
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
    }

    @Override
    public void lanzarHechizo() {
        // Implementar lógica del hechizo
        System.out.println(nombre + " lanza un hechizo!");
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        this.hechizo = hechizo;
        System.out.println(nombre + " aprende el hechizo: " + hechizo);
    }
}