import java.util.Scanner;
public class Ejercicio4 {
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

        int num1[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print(V+"Introduce "+B+"10"+V+" numeros: "+RS+"\n");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = sc.nextInt();
        }

    }
    public static int moda(int[] numeros){
        int moda = 0;
        int maxCount = 0;

        for (int i = 0; i < numeros.length; i++) {
            int count = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                moda = numeros[i];
            }
        }

        return moda;
    }
}
