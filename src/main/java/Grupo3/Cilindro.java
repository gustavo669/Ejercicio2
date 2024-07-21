package Grupo3;

public class Cilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
