package Grupo3;

public class Cilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitar al usuario la altura del cilindro
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cilindro
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Mostrar el resultado
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
