package a04;

public class ImpresoraAvanzada implements Multifuncion{
    @Override
    public void imprimir(int cantidad, String documento){
        for(int i = 1; i <= cantidad; i++) {
            System.out.println("Imprimiendo copia " + i + " de " + documento);
        }
        System.out.println("Proceso terminado");
    }

    @Override
    public void escanear(String documento, String correo){
         System.out.println("Documento " + documento + " escaneado y enviado a " + correo);
    }
}
