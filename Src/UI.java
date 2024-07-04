package Src;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Calc calc = new Calc();
        boolean bucle = true;

        while (bucle) {
            System.out.println("Bienvenido, ingresa la opcion que desea realizar: ");
            System.out.println("1. Suma ");
            System.out.println("2. Resta ");
            System.out.println("3. Multiplicacion ");
            System.out.println("4. Salir ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    calc.suma();
                    break;
                case 2:
                    calc.resta();
                    break;
                case 3:
                    calc.multiplicacion();
                    break;
                case 4:
                    System.out.println("¡Gracias por confiarnos tus resultados, hasta pronto!");
                    bucle = false;
                    break;
                default:
                    System.out.println("Intenta nuevamente");
                    break;
            }
        }

        leer.close();
    }
}
