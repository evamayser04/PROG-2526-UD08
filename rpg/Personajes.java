package rpg;

public abstract class Personajes {
    protected String nombre;
    protected int nivel;
    protected int puntos = 100;

    Personajes(String nombre, int nivel) {
    this.nombre = nombre;
    this.nivel = nivel;
    }
    public void danio(int dolor){
        puntos -= dolor;
        if(puntos < 0){
            puntos = 0;
        }
        System.out.println("Has recibido: " + dolor + "puntos de daño, actualmente tu vida esta en:" + puntos);
    }

    public void curar(int cantidad) {
        puntos += cantidad;

        if (puntos > 100) {
            puntos = 100;
        }
    }
    
    public abstract void grito();

}
