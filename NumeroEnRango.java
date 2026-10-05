import java.util.Scanner;

public class NumeroEnRango {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        // Evaluamos si el número está entre 20 y 50 inclusive
        if (numero >= 20 && numero <= 50) {
            System.out.println("El número está dentro del rango.");
        } else {
            System.out.println("El número está fuera del rango.");
        }

        entrada.close(); // Para evitar la línea amarilla de advertencia
    }
}