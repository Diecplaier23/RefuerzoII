import java.util.Scanner;
public class Ejercicio3 {
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

        String num1;
        String es_numero=" ";
        Scanner sc = new Scanner(System.in);
        System.out.print(V+"Introduce dos números positivos"+RS+"\n");
        num1 = sc.nextLine();
        System.out.print(esNumero(num1, es_numero));
        System.out.println(V+"La suma de "+B+N+sumaDigitos(num1));


    }
    public static String esNumero(String num1,String es_numero) {
        if (Character.isLetter(num1.charAt(0))) {
            es_numero=R+"Introduce unicamente números"+RS+"\n";
        } else if (Integer.parseInt(num1) < 0) {
            es_numero=R+"Introduce unicamente números positivos"+RS+"\n";
        }
        return es_numero;
    }
    public static String sumaDigitos(String num1) {
        char caracteres[] = num1.toCharArray();
        String[] simbolos = {"+", " = "};
        int suma = 0;
        String digitos = "";

        for (int i = 0; i < caracteres.length; i++) {
            suma += Character.getNumericValue(caracteres[i]);

            digitos += caracteres[i];

            if (i < caracteres.length - 1) {
                digitos += " + ";
            }else{
                digitos += " = " + suma;
            }
        }
        return digitos;
    }
}
