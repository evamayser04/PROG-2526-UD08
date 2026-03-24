public class NotificacionEmail implements Notificable {
    
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println("Este mensaje a sido enviado por email: " + mensaje );
    }
}


