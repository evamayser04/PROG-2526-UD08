package rpg;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guerrero g = new Guerrero("Thor", 3);
        Mago m = new Mago("Merlin", 6);
        Clerigo c = new Clerigo("Uther", 4);

        ArrayList<Personajes> batallon = new ArrayList<>();
        batallon.add(g);
        batallon.add(m);
        batallon.add(c);

        // Grito de batalla
        for (Personajes p : batallon) {
            p.grito();
        }

        System.out.println("---- COMBATE ----");

        // Simulación
        System.out.println("El guerrero ataca al mago");g.atacar(m);
        System.out.println("El clerigo cura al mago");c.curar(m);
    }
}
