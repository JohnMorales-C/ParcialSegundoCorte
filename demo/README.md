
# *Juego de Peleas entre Criaturas*

Este proyecto es un jueguito donde las criaturas se pelean entre sí. Cada una tiene sus formas de como atacar y defenderse.

## *Qué hay en el código*

- *Base de las criaturas*: Una plantilla general con nombre, vida y fuerza. Todas las criaturas saben como atacar y defenderse de manera diferente. También, luchan para conservar sus vidas.

- *Habilidades especiales*:
 
  - "Volador" para criaturas que pueden volar.
  - "Mágico" para criaturas que usan magia.

- *Armas*: Las criaturas pueden equipar armas para aumentar su daño al atacar.

- *Criaturas que hay*:

  - Dragón: Ataca con fuerza doble y puede volar.
  - Mago: Ataca normal y lanza hechizos.
  - Guerrero: Ataca normal con espada.

- *Cómo se pelean*: Se pelean por medio de un sistema de turnos, donde cada criatura ataca por turno hasta que una se muera. Muestra cada golpe y la vida restante.

- *Programa principal*: Crea criaturas, les da armas y las pone a pelear. Al final dice quién ganó.

- *Pruebas*: Chequean que las criaturas funcionen bien.

## *Cómo usarlo*

1. Compila: mvn compile
2. Prueba: mvn test
3. Corre: java -cp target/classes com.example.Main