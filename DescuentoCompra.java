import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra (S/): ");
        double monto = entrada.nextDouble();

        // Evaluamos si el monto es mayor o igual a 300 soles
        if (monto >= 300) {
            System.out.println("¡Aplica a un descuento del 10%!");
        } else {
            System.out.println("No aplica al descuento. Compra menor a S/300.");
        }

        entrada.close();
    }
}
