package programas;

import java.util.Scanner;

public class ProgramaSumar {

public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar el primer número
    System.out.print("Introduce el primer número: ");
    double numero1 = scanner.nextDouble();

    // Solicitar el segundo número
    System.out.print("Introduce el segundo número: ");
    double numero2 = scanner.nextDouble();

    // Calcular la suma
    double suma = numero1 + numero2*numero2;

    // Mostrar el resultado
    System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

    // Cerrar el scanner
    scanner.close();
}
}