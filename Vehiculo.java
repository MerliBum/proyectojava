import java.util.Scanner;

public class Vehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la marca del vehículo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingresa el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingresa la cilindrada del vehículo: ");
        String cilindrada = scanner.nextLine();
        System.out.print("Ingresa el tipo de combustible: ");
        String combustible = scanner.nextLine();
        System.out.print("Ingresa la capacidad de pasajeros: ");
        int capacidadPasajeros = scanner.nextInt();
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
        
        scanner.close();
    }
}
