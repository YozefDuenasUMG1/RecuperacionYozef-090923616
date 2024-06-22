import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExamenFinalVarianteA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar operación matemática");
            System.out.println("2. Gestionar lista de estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion();
                    break;
                case 2:
                    gestionarEstudiantes();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
