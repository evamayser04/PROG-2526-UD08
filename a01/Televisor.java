package a01;

public class Televisor implements DispositivoConectado {

    @Override
    public void encender(){
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }

    @Override
    public void conectar(String tipoRed){
        if(tipoRed.equals(TIPO_RED)){
            System.out.println("Televisor conectado a la red " + TIPO_RED);
            System.out.println("buscando actualizaciones de firmware");
        }else{
            System.out.println("Televisor no conectado");
        }
    };
}
