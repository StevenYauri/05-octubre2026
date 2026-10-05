import java.util.Scanner;

public class SistemaAdmision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitamos la nota de Matemática
        System.out.print("Ingrese la nota de Matemática: ");
        int notaMatematica = entrada.nextInt();

        // Solicitamos la nota de Comunicación
        System.out.print("Ingrese la nota de Comunicación: ");
        int notaComunicacion = entrada.nextInt();

        // Ambas notas deben ser mayores o iguales a 11
        if (notaMatematica >= 11 && notaComunicacion >= 11) {
            System.out.println("Postulante apto.");
        } else {
            System.out.println("Postulante NO apto.");
        }

        entrada.close();
    }
}
