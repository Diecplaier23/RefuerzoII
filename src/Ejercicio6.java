import java.util.Scanner;

public class Ejercicio6 {
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
        System.out.print(V + "Introduce numero: " + RS + "\n");
        int num = sc.nextInt();
        if (esHyperpar(num)) {
            System.out.print(V + "El numero es "+B+N+"Hyperpar" + RS + "\n");
        } else {
            System.out.print(R + "El numero no es "+B+N+"Hyperpar" + RS + "\n");
        }
    }
    public static boolean esHyperpar(int num) {
        int cifra;
        while (num > 0) {
            cifra = num % 10;
            if (cifra % 2 != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}