package clases;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Interfaz {
	public static void main(String[] args) {
		ClientInfo info_clientes= new ClientInfo();
		ServiceInfo info_servicios=new ServiceInfo();
		Interfaz interfaz = new Interfaz();
		Login users = new Login();
		Scanner input = new Scanner(System.in);

		System.out.println("¡Bienvenido a nuestro sistema de reservas y servicios!");
		System.out.println("Por favor, ingrese su usuario y contraseña para continuar.");

		System.out.println("Usuario: ");
		String usuario = input.next();

		System.out.println("Contraseña: ");
		String contrasena = input.next();

		if (users.verifyUser(usuario, contrasena)) {
			System.out.println("¡Login exitoso!");

			String userType = users.getUserType(usuario);

			switch (userType) {
			case "admin":
				// Mostrar menu de opciones de Admin
				break;
			case "empleado":
				// Mostrar menu de opciones de Empleado
				break;
			case "invitado":
				// Mostrar menu de opciones de Invitado
				System.out.println("¿Qué acción desea realizar?");
				System.out.println("1. Nueva reserva");
				System.out.println("2. Adquirir servicio");

				int accion = input.nextInt();

				switch (accion) {
				case 1:
					System.out.println("Por favor ingrese los datos de la reserva");
					System.out.println("Fecha de inicio (en formato dd/MM/yyyy): ");
					String fechaInicioString = input.next();
					System.out.println("Fecha de fin (en formato dd/MM/yyyy): ");
					String fechaFinString = input.next();
					System.out.println("Nombre del residente: ");
					String nombreResidente = input.next();
					System.out.println("Correo del residente: ");
					String correoResidente = input.next();
					System.out.println("Tipo de ID del residente: ");
					String tipoIDResidente = input.next();
					System.out.println("Número de ID del residente: ");
					int numeroIDResidente = input.nextInt();
					System.out.println("Tipo de habitación: ");
					String tipoHabitacion = input.next();

					// Convertir fechas de string a Date
					Date fechaInicio = new Date();
					Date fechaFin = new Date();
					try {
						fechaInicio = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(fechaInicioString);
						fechaFin = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(fechaFinString);
					} catch (ParseException e) {
						e.printStackTrace();
					}

				
					Reserve nuevaReserva = new Reserve(fechaInicio, fechaFin, nombreResidente, correoResidente,
							tipoIDResidente, numeroIDResidente, tipoHabitacion);
					
					info_clientes.addClient(tipoHabitacion, usuario, userType, contrasena);

					System.out.println("Reserva creada exitosamente:");
					System.out.println(nuevaReserva);
					break;

				case 2:
					System.out.println("Por favor ingrese los datos del servicio");
					System.out.println("Nombre del servicio: ");
					String nombreServicio = input.next();
					
					//!!!!!toca buscar dentro de la lista de servicios si existe y de ser el caso agregarlo
					
					info_servicios.agregarServicio(usuario, servicio );
					
					System.out.println("Servicio creado exitosamente");
					break;
				default:
					System.out.println("Opción inválida");
					break;
				}
			}
		}
	}
}
