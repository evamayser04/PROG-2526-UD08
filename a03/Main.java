public class Main {
    public static void main(String[] args) {
        
        Notificable[] notis = new Notificable[3];

        notis[0] = new NotificacionEmail();
        notis[1] = new NotificacionSMS();
        notis[2] = new NotificacionPush();

        String mensaje = "Mantenimiento urgente del servidor";
        for (Notificable noti : notis) {
            noti.enviarNotificacion(mensaje);
        }
    }
}
