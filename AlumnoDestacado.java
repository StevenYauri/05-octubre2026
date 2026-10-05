import java.util.Scanner;

public class AlumnoDestacado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la nota del alumno: ");
        int nota = entrada.nextInt();

        // Evaluamos si la nota es mayor o igual a 17
        if (nota >= 17) {
            System.out.println("Alumno destacado.");
        } else {
            System.out.println("Alumno con rendimiento regular.");
        }

        entrada.close();
    }
}
