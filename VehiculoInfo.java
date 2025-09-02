import java.util.Scanner;

public class VehiculoInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        String marca = input.nextLine();

        System.out.print("Ingrese el modelo: ");
        String modelo = input.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        String cilindrada = input.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = input.nextLine();

        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidad = input.nextInt();

        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
    }
}
