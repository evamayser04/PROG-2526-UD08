package a04;

public class Main {
    public static void main(String[] args) {
    ImpresoraBasica basica = new ImpresoraBasica();
    ImpresoraAvanzada avanzada = new ImpresoraAvanzada();

    System.out.println("-----Prueba de escaneo con impresora avanzada-----");
    avanzada.escanear("documento.pdf", "correo@gmail.com");
    
    System.out.println("-----Prueba de impresión con impresora avanzada-----");
    avanzada.imprimir(3, "documento.pdf");
    

    System.out.println("-----Prueba de impresión con impresora básica-----");
    basica.imprimir(3, "documento.pdf");


    //basica.escanear("documento.pdf", "correo@gmail.com");
    //eror no hay implementación  de escaneable
    }
}
