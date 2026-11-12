import java.util.Scanner;

public class Ejercicio7 {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m";// Cian claro
    public static final String RS = "\u001B[0m";// Reiniciar
    public static final String I = "\u001B[3m"; // Cursiva
    public static final String N = "\u001B[1m";// Negrita

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desde, hasta;
        System.out.print(V + "Introduce el canal en el que estás y luego al que quieres ir: " + RS + "\n");
        desde = sc.nextInt();
        hasta = sc.nextInt();
        System.out.println(CC + "Tienes que pulsar los botones " + B+N + canales(desde, hasta) + CC + " veces." + RS);
    }
    public static int canales(int desde, int hasta) {
        int avanzar = (hasta - desde + 99) % 99;
        int retroceder = (desde - hasta + 99) % 99;
        if (avanzar < retroceder) {
            return avanzar;
        } else {
            return retroceder;
        }
    }
}