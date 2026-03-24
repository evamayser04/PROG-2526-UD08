package a05;
import a03.Notificable;

public class Main {
    public static void main(String[] args) {
        
        String mensajeCEO = "Cuu cuu: El CEO os saluda";

        Notificable paloma = new Notificable() {
            @Override
            public void enviarNotificacion(String mensaje){
                System.out.println(mensaje);
            }
        };

        paloma.enviarNotificacion(mensajeCEO);
    }
}

