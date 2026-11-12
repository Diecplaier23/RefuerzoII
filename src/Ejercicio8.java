import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m";// Cian claro
    public static final String RS = "\u001B[0m";//Reiniciar
    public static final String I = "\u001B[3m"; // Cursiva
    public static final String N = "\u001B[1m";//Negrita
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String serie;
        System.out.print(V + "Introduce una serie de números y te diremos cuál falta: " + RS + "\n");
        serie = sc.nextLine();

        if (serie.trim().isEmpty()) {
            System.out.println("Debes introducir una serie de números.");
            return;
        }
        String[] numerosTexto = serie.split("[,\\s]+");
        int[] numerosArray = new int[numerosTexto.length];

        for (int i = 0; i < numerosTexto.length; i++) {
            numerosArray[i] = Integer.parseInt(numerosTexto[i]);
        }
        int numeroFaltante = cualFalta(numerosArray);
        if (numeroFaltante != -1) {
            System.out.println("El número que falta es: " + numeroFaltante);
        } else {
            System.out.println("No falta ningún número en la serie.");
        }
    }

    public static int cualFalta(int[] numeros) {
        if (numeros == null || numeros.length < 2) {
            return -1;
        }

        int[] ordenados = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenados);
        for (int i = 1; i < ordenados.length; i++) {
            if (ordenados[i] - ordenados[i - 1] > 1) {
                return ordenados[i - 1] + 1;
            }
        }
        return -1;
    }
}
