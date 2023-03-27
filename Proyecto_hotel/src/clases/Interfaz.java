package clases;

import java.util.Scanner;

public class Interfaz {
    private static Scanner scanner = new Scanner(System.in);
    private static Login login = new Login();

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de reservaciones");

        // Pedir login y contraseña
        System.out.print("Ingrese su login: ");
        String loginInput = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String passwordInput = scanner.nextLine();

        // Verificar si el usuario está registrado
        if (!login.verifyUser(loginInput, passwordInput)) {
            System.out.println("Lo siento, no estás registrado en el sistema");
            return;
        }

        // Si el usuario está registrado, preguntar si es invitado o empleado
        System.out.println("¿Eres un invitado o un empleado?");
        System.out.println("1. Invitado");
        System.out.println("2. Empleado");
        System.out.print("Ingrese su opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (option == 1) {
            // Crear una nueva reserva
            System.out.println("Nueva reserva");
            System.out.print("Ingrese la fecha de inicio (dd/mm/yyyy): ");
            String startDate = scanner.nextLine();
            System.out.print("Ingrese la fecha de fin (dd/mm/yyyy): ");
            String endDate = scanner.nextLine();
            System.out.print("Ingrese el nombre del residente: ");
            String residentName = scanner.nextLine();
            System.out.print("Ingrese el correo electrónico del residente: ");
            String residentEmail = scanner.nextLine();
            System.out.print("Ingrese el tipo de identificación del residente: ");
            String residentIdType = scanner.nextLine();
            System.out.print("Ingrese el número de identificación del residente: ");
            int residentIdNumber = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // TODO: Crear la reserva con los datos ingresados
            System.out.println("Reserva creada exitosamente");
            
            
        } else if (option == 2) {
            // Preguntar si es administrador o no
            System.out.println("¿Eres administrador?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.print("Ingrese su opción: ");
            int adminOption = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (adminOption == 1) {
                // TODO: Menú para administradores
                System.out.println("Menú para administradores");
            } else {
                // TODO: Menú para empleados normales
                System.out.println("Menú para empleados no administradores");
            }
        } else {
            System.out.println("Opción inválida");
        }
    }
}
