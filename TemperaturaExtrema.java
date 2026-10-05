import java.util.Scanner;

public class TemperaturaExtrema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la temperatura actual (°C): ");
        double temperatura = entrada.nextDouble();

        // Evaluamos si la temperatura es estrictamente mayor a 35
        if (temperatura > 35) {
            System.out.println("Temperatura extrema.");
        } else {
            System.out.println("Temperatura dentro del rango normal.");
        }

        entrada.close();
    }
}
