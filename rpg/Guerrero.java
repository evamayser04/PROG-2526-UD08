package rpg;

class Guerrero extends Personajes implements Atacante{
    Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar(Personajes objetivo) {
        objetivo.danio(20);
    }

    @Override
    public void grito() {
        System.out.println(nombre + ": ¡Por la alianza!");
    }

}
