package com.example;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
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
    public void volar() {}

    @Override
    public void aterrizar() {}
}
