import java.util.Scanner;

public class NumeroTresCifras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        // Convertimos el número a positivo para evaluar también negativos de 3 cifras (ej: -150)
        int numeroPositivo = Math.abs(numero);

        // Un número tiene tres cifras si está entre 100 y 999 inclusive
        if (numeroPositivo >= 100 && numeroPositivo <= 999) {
            System.out.println("El número " + numero + " tiene tres cifras.");
        } else {
            System.out.println("El número " + numero + " NO tiene tres cifras.");
        }

        entrada.close();
    }
}
