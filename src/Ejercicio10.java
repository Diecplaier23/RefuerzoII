import java.util.Scanner;

public class Ejercicio10 {
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
        System.out.print(V + "Introduce el número de compartimentos, los litros del más grande y la diferencia: " + RS + "\n");
        int compartimentos = sc.nextInt();
        int maxLitros = sc.nextInt();
        int diferencia = sc.nextInt();
        System.out.println(CC + "Se necesitan " + B + N
                + litros(compartimentos, maxLitros, diferencia) + CC + " litros." + RS);
    }

    public static int litros(int compartimentos, int maxLitros, int diferencia) {
        if (compartimentos <= 0 || maxLitros <= 0 || diferencia < 0) {
            throw new IllegalArgumentException("Los valores deben cumplir las condiciones del enunciado.");
        }

        long totalLitros = 0;
        for (int i = 0; i < compartimentos; i++) {
            totalLitros += (long) maxLitros - (long) i * diferencia;
        }
        return Math.toIntExact(totalLitros);
    }
}
