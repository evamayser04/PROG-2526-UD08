package a01;

public interface DispositivoConectado {
    String TIPO_RED = "Wi-Fi 7";

    void encender();

    void apagar();

    default void conectar(String tipoRed){
        if(tipoRed.equals(TIPO_RED)){
            System.out.println("Dispositivo conectado a la red " + TIPO_RED);
        }else{
            System.out.println("Dispositivo no conectado");
        }
    };

    static void mostrarInfoGeneral(){
        System.out.println("Dispositivos conectados mediante " + TIPO_RED);
    }
}