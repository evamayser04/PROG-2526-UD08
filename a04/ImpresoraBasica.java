package a04;

public class ImpresoraBasica implements Imprimible {
    @Override
    public void imprimir(int cantidad, String documento){
        for(int i = 1; i <= cantidad; i++) {
            System.out.println("Imprimiendo copia " + i + " de " + documento);
        }
        System.out.println("Proceso terminado");
    };
}
