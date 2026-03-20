package a02;

public class Main {
    public static void main(String[] args) {
        PagoBizum bizum = new PagoBizum();
        PagoTarjeta tarje = new PagoTarjeta();
        
        bizum.procesarPago(50);

        tarje.procesarPago(1500);
    }
}
