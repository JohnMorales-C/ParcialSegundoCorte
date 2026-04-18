package com.example;

public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Dragon", 100, 20);
        Mago mago = new Mago("Mago", 80, 15);
        Guerrero guerrero = new Guerrero("Guerrero", 90, 18);

        Arma espada = new Arma("Espada", 5);
        Arma baston = new Arma("Baston", 7);

        guerrero.equiparArma(espada);
        mago.equiparArma(baston);

        Batalla.iniciarBatalla(dragon, guerrero);
    }
}