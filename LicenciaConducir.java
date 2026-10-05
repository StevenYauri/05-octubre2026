import java.util.Scanner;

public class LicenciaConducir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        // Evaluamos si la edad es 18 o más
        if (edad >= 18) {
            System.out.println("Puede obtener la licencia de conducir.");
        } else {
            System.out.println("No cumple con la edad mínima para obtener la licencia.");
        }

        entrada.close(); // Cierra el scanner para evitar advertencias de VS Code o NetBeans
    }
}
