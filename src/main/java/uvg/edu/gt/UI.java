package uvg.edu.gt;

import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calculadora = new Calc();

        // Mostramos un menú de opciones
        System.out.println("Calculadora básica:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Salir");

        boolean salir = false;
        while (!salir) {
            System.out.print("Seleccione una opción (1-4): ");
            int opcion = scanner.nextInt();
            int resultado;

            switch (opcion) {
                case 1:
                    // Suma
                    System.out.print("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    resultado = calculadora.suma(num1, num2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    // Resta
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    resultado = calculadora.resta(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    // Multiplicación
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    resultado = calculadora.multiplicacion(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    // Salir del programa
                    salir = true;
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida (1-4).");
                    break;
            }
        }

        // Cerramos el scanner al finalizar
        scanner.close();
    }
}