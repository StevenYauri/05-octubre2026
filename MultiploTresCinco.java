import java.util.Scanner;

public class MultiploTresCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        // Evaluamos si el residuo de dividir entre 3 es cero Y entre 5 también es cero
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3 y de 5 al mismo tiempo.");
        } else {
            System.out.println("El número " + numero + " NO cumple con ambas condiciones.");
        }

        entrada.close();
    }
}
