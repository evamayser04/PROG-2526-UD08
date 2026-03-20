package a02;

public class PagoTarjeta implements MetodoPago {

    @Override
    public void procesarPago(double importe){
        System.out.println("Pago realizado con tarjeta");
        logTransaccion(importe);
    }
}
