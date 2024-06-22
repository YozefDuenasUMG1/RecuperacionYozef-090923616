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

    public static void realizarOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
    public static void gestionarEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i+1) + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la calificación del estudiante " + (i+1) + ": ");
            double calificacion = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            estudiantes.add(new Estudiante(nombre, calificacion));
        }

        System.out.println("\nLista de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Calificación: " + estudiante.getCalificacion());
        }
    }
}

class Catedratico {
    private String nombre;
    private int edad;
    private String especialidad;
    private double salario;

    public Catedratico() {}

    public Catedratico(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Catedratico(String nombre, int edad, String especialidad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.salario = salario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Estudiante {
    private String nombre;
    private double calificacion;

    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}



