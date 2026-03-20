package a02;

interface MetodoPago {
    double IVA = 0.21;
     
    void procesarPago(double importe);

    private void logTransaccion(double importe){
        System.out.println("Transacción" + importe + "completada con exito!");
    }

    default void generarFactura(double importe) {
        logTransaccion(importe);
        double total = importe + (importe * IVA);
        System.out.println("Importe final con IVA: " + total);
    }
}
