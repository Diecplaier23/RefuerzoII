import java.util.Scanner;
public class Ejercicio1 {

        public static final String R = "\u001B[31m";  // Rojo
        public static final String V = "\u001B[32m";  // Verde
        public static final String B = "\u001B[97m";  // Blanco
        public static final String C = "\u001B[36m";  // Cian
        public static final String A = "\u001B[33m";  // Amarillo
        public static final String CC = "\u001B[96m";// Cian claro
        public static final String RS = "\u001B[0m";//Reiniciar
        public static final String I = "\u001B[3m"; // Cursiva
        public static final String N = "\u001B[1m";// Restablece el color original
        public static void main(String[] args) {

            int num[] = new int[10];
            Scanner sc = new Scanner(System.in);
            System.out.print(V + "Introduce " + B + "10" + V + " numeros: " + RS + "\n");

            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            System.out.println(V + "Orden: " + B + orden(num) + RS);
        }

        public static String orden(int[] numeros) {
            boolean ascendente = true;
            boolean descendente = true;

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > numeros[i - 1]) {
                    descendente = false;
                } else if (numeros[i] < numeros[i - 1]) {
                    ascendente = false;
                }
            }

            if (ascendente && descendente) {
                return "Iguales";
            }
            if (ascendente) {
                return "Ascendente";
            }
            if (descendente) {
                return "Descendente";
            }
            return "Desordenado";
        }
}
