package a02;

public class PagoBizum implements MetodoPago {

    @Override
    public void procesarPago(double importe){
        System.out.println("Pago realizado con bizum");
        if(importe>500){
            System.out.println("No se puede realizar la info");
        }else{
            logTransaccion(importe);
        }
    }
}
