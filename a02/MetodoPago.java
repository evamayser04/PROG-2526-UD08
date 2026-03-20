package a02;
import java.util.Scanner;

public interface MetodoPago {
    double IVA = 0.21;
     
    void procesarPago(double importe);

    default void logTransaccion(double importe){
        String opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Transacción completada con exito!");
        System.out.println("Quieres generar factura?si o no");
        opcion = sc.nextLine();
        if(opcion.equals("si")){
            generarFactura(importe);
        }
    }

    private void generarFactura(double importe) {;
        double totalConIVA = importe + (importe * IVA);
        System.out.println("Importe final con IVA: " + totalConIVA);
        
    }
}
