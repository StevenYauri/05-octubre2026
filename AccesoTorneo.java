import java.util.Scanner;

public class AccesoTorneo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad del participante: ");
        int edad = entrada.nextInt();

        // Evaluamos si la edad está entre 15 y 18 años inclusive
        if (edad >= 15 && edad <= 18) {
            System.out.println("Puede participar en el torneo.");
        } else {
            System.out.println("No cumple con el rango de edad requerido (15 a 18 años).");
        }

        entrada.close(); // Cierra el scanner para mantener el código limpio
    }
}
