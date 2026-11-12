import java.util.Scanner;

public class Ejercicio2 {
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
        int dia=0;
        int mes=0;
        Scanner sc = new Scanner(System.in);
        System.out.print(V+"Introduce un dia y un mes que quieras"+RS+"\n");
        dia = sc.nextInt();
        mes = sc.nextInt();

        System.out.print(V+"Quedan "+N+B+diasHastaNochevieja(dia, mes)+RS+V+" dias hasta nochevieja"+RS+"\n");

    }public static int diasHastaNochevieja(int dia, int mes){
        int dias_restantes=0;
        switch (mes){
            case 1:
                dias_restantes = 365 - dia;
                break;
            case 2:
                dias_restantes = 365 - (31 + dia);
                break;
            case 3:
                dias_restantes = 365 - (31 + 28 + dia);
                break;
            case 4:
                dias_restantes = 365 - (31 + 28 + 31 + dia);
                break;
            case 5:
                dias_restantes = 365 - (31 + 28 + 31 + 30 + dia);
                break;
            case 6:
                dias_restantes = 365 - (31 + 28 + 31 + 30 + 31 + dia);
                break;
            case 7:
                dias_restantes = 365 - (31 + 28 + 31 + 30 + 31 + 30 + dia);
                break;
            case 8:
                dias_restantes = 365 - (31 + 28 + 31 + 30 + 31 + 30 + 31 + dia);
                break;
            case 9:
                dias_restantes = 365 - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dia);
                break;
            case 10:
                dias_restantes =365 - (31+28+31+30+31+30+31+31+30+dia);
                break;
            case 11:
                dias_restantes =365-(31+28+31+30+31+30+31+31+30+31+dia);
                break;
            case 12:
                dias_restantes=0;
        }
        return dias_restantes;
    }
}
