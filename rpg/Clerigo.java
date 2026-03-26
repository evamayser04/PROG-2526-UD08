package rpg;

class Clerigo extends Paladin {
    Clerigo(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar(Personajes objetivo) {
        objetivo.danio(10);
    }

    @Override
    public void curar(Personajes objetivo){
        objetivo.curar(20);
    }
}
