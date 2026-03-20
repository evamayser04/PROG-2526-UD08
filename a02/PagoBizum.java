package a02;

class PagoBizum implements MetodoPago {

    @Override
    public void procesarPago(double importe){
        System.out.println("Pago realizado con bizum");
    }
}
