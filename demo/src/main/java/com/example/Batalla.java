package com.example;

public class Batalla {

    public static void iniciarBatalla(Criatura c1, Criatura c2) {
        int turno = 1;
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("Turno " + turno + ":");
            System.out.println(c1.getNombre() + " ataca a " + c2.getNombre());
            c1.atacar(c2);
            System.out.println(c2.getNombre() + " tiene " + c2.getSalud() + " de salud.");
            if (!c2.estaViva()) {
                System.out.println(c2.getNombre() + " ha muerto!");
                break;
            }
            System.out.println(c2.getNombre() + " ataca a " + c1.getNombre());
            c2.atacar(c1);
            System.out.println(c1.getNombre() + " tiene " + c1.getSalud() + " de salud.");
            if (!c1.estaViva()) {
                System.out.println(c1.getNombre() + " ha muerto!");
            }
            turno++;
        }
    }
}
