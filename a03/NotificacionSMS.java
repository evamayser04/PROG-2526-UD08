package a03;

public class NotificacionSMS implements Notificable {
    
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println("Este mensaje a sido enviado por SMS: " + mensaje );
    }
}
