import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static final String R = "\u001B[31m";  // Rojo
    public static final String V = "\u001B[32m";  // Verde
    public static final String B = "\u001B[97m";  // Blanco
    public static final String C = "\u001B[36m";  // Cian
    public static final String A = "\u001B[33m";  // Amarillo
    public static final String CC = "\u001B[96m";// Cian claro
    public static final String RS = "\u001B[0m";//Reiniciar
    public static final String I = "\u001B[3m"; // Cursiva
    public static final String N = "\u001B[1m";// Restablece el color original
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print(V+"Introduce numeros: "+RS+"\n");
        String numerosStr = sc.nextLine().trim();
        if (numerosStr.isEmpty()) {
            System.out.println(R+"Debes introducir al menos un número."+RS);
            return;
        }

        String[] numerosArray = numerosStr.split("\\s+");
        int[] numeros = new int[numerosArray.length];
        for (int i = 0; i < numerosArray.length; i++) {
            numeros[i] = Integer.parseInt(numerosArray[i]);
        }

        System.out.println(V+"La mediana es: "+N+B+mediana(numeros)+RS);
    }

    public static double mediana(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("La lista de números no puede estar vacía.");
        }

        int[] ordenados = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(ordenados);
        int medio = ordenados.length / 2;

        if (ordenados.length % 2 == 1) {
            return ordenados[medio];
        }
        return ((double) ordenados[medio - 1] + ordenados[medio]) / 2;
    }
}
