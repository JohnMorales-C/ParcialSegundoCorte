package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CriaturaTest {

    @Test
    void testEstaViva() {
        Guerrero g = new Guerrero("Test", 50, 10);
        assertTrue(g.estaViva());
    }

    @Test
    void testAtaque() {
        Guerrero g1 = new Guerrero("A", 50, 10);
        Guerrero g2 = new Guerrero("B", 50, 10);

        g1.atacar(g2);

        assertTrue(g2.getSalud() < 50);
    }
}
