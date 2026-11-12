public class Ejercicio7Test {
    public static int canales(int desde, int hasta){
        // para ir de un canal a otro, debemos saber cúal es el pequeño
        // y cúal es el mayor
        // Por ejemplo, desde 20 y hasta 30
        int mayor = Math.max(hasta, desde);
        int menor = Math.min(hasta, desde);
        // Ahora vemos las dos opciones
        // Una suponer que no da la vuelta
        int uno = mayor - menor;
        // Y la otra es subir hasta dar la vuelta (99 - mayor)
        // los canales y llegar al menor
        int dos = 99 - mayor + menor;
        // y nos quedamos con la más pequeña
        return (Math.min(uno, dos));
    }
    public static void main(String[] args) {
        System.out.println(canales(99, 7));// 7
        System.out.println(canales(2, 5));// 3
        System.out.println(canales(2, 99));// 2
        System.out.println(canales(5, 63));// 41
    }
}
