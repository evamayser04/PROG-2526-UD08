package a01;

public class Main {
    public static void main(String[] args) {
        Bombilla bombi = new Bombilla();
        Televisor tele = new Televisor();

        bombi.encender();
        bombi.conectar(DispositivoConectado.TIPO_RED);
        bombi.apagar();
        DispositivoConectado.mostrarInfoGeneral();
        System.out.println("---------------------------------------");

        System.out.println("Bombilla conectada de manera diferente:");
        bombi.conectar("Wi-Fi 7");
        bombi.conectar("Wi-Fi 8");

        System.out.println("-----------------------------------------");
        tele.encender();
        tele.conectar(DispositivoConectado.TIPO_RED);
        tele.apagar();
        DispositivoConectado.mostrarInfoGeneral();
    }
}
