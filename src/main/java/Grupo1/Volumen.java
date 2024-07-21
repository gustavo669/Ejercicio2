package Grupo1;

import java.util.Scanner;

public class Volumen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();

        double volumen = Math.pow(lado, 3);

        System.out.println("El volumen del cubo es: " + volumen);
    }
}