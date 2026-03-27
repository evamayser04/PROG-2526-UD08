package rpg;

    class Paladin extends Personajes implements Atacante, Curador{
    Paladin(String nombre, int nivel) {
        super(nombre, nivel);
    }

     @Override
    public void atacar(Personajes objetivo) {
        objetivo.danio(10);
    }

    @Override
    public void curar(Personajes objetivo) {
        objetivo.curar(20);
    }

    @Override
    public void grito() {
        System.out.println(nombre + ": ¡La luz me guía!");
    }

}
