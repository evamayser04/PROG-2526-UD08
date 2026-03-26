package rpg;

class Mago extends Personajes implements Atacante{
    Mago(String nombre, int nivel){
        super(nombre, nivel);
    }

    @Override
    public void atacar(Personajes objetivo) {
        if(nivel > 5){
            objetivo.danio(30);
        }else{
            objetivo.danio(10);
        }
    }

    @Override
    public void grito() {
        System.out.println(nombre + ": ¡Fuego y destruccion!");
    }
}
