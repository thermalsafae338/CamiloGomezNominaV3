package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.Empleados;

public class Controller {
	private Empleados modelo = new Empleados();
	
	public Controller() {
		Scanner sc = new Scanner(System.in);
		boolean active = true;
		while(active) {
			System.out.print("Ingresa una opcion: ");
			var opcion = sc.nextInt();
			switch(opcion) {
			default:
				System.out.println("Error");
				break;
			case 0:
				modelo.guardarEmpleados();
				break;
			case 1:
				System.out.print("Ingresa el ID de un empleado");
				var id = sc.nextInt();
				System.out.println(modelo.getEmpleado()[id].datosCompletos());
			}
		}
		
	}
	
	public static void main(String[] args) {
		Controller c = new Controller();
	}
}
