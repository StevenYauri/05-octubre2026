import java.util.Scanner;

public class SueldoAlto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el sueldo del trabajador (S/): ");
        double sueldo = entrada.nextDouble();

        // Evaluamos si el sueldo es estrictamente mayor a 3500 soles
        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de ingresos altos.");
        } else {
            System.out.println("Pertenece al grupo de ingresos regulares o bajos.");
        }

        entrada.close();
    }
}
