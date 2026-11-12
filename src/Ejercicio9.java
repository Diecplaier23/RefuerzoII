import java.util.Scanner;

public class Ejercicio9 {
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
        System.out.print(V + "Introduce el dividendo y el divisor: " + RS + "\n");
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(CC + "El resultado de dividir los factoriales es: "
                + B + N + dividirFactoriales(dividendo, divisor) + RS);
    }

    public static int dividirFactoriales(int dividendo, int divisor) {
        if (dividendo < 1 || divisor < 1 || dividendo < divisor) {
            throw new IllegalArgumentException("Los factoriales deben ser positivos y el dividendo no puede ser menor que el divisor.");
        }

        int resultado = 1;
        for (long factor = (long) divisor + 1; factor <= dividendo; factor++) {
            resultado = Math.multiplyExact(resultado, (int) factor);
        }
        return resultado;
    }
}
