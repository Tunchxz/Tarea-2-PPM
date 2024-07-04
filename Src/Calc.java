package Src;

import java.util.Scanner;

public class Calc {

    private static Scanner leer = new Scanner(System.in);

    public void suma() {
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();

        int n3 = n1 + n2;

        System.out.println("Su resultado es: " + n3);
    }

    public void resta() {
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();

        int n3 = n1 - n2;

        System.out.println("Su resultado es: " + n3);
    }

    public void multiplicacion() {
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();

        int n3 = n1 * n2;

        System.out.println("Su resultado es: " + n3);
    }

}