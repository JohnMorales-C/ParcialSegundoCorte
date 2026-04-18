package com.example;

public class Batalla {

    public static void iniciarBatalla(Criatura c1, Criatura c2) {
        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (!c2.estaViva()) break;
            c2.atacar(c1);
        }
    }
}
