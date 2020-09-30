package co.edu.unbosque.model;

import java.io.IOException;

import co.edu.unbosque.model.persistence.Archivos;
import co.edu.unbosque.model.persistence.Propiedades;

public class Empleados {
	private Propiedades p = new Propiedades();
	private Empleado[] empleado;
	private Archivos archivos = new Archivos();
	
	public Empleados() {
		construirEmpleados();
		try {
			var empleados = archivos.leerArchivo().split("\n");
			System.out.println(p.leerPopiedades());
			for (int i = 1; i < empleados.length; i++) {
				var nuevoEmpleado = empleados[i].split(";");
				if(Double.parseDouble(nuevoEmpleado[2])<=2000) { 
					empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),10);
				}
				else if(Double.parseDouble(nuevoEmpleado[2])>2000 && Double.parseDouble(nuevoEmpleado[2])<=5000) {
					empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),15);
				
				}
				else if (Double.parseDouble(nuevoEmpleado[2])>5000) {
					empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),20);
				}
				
				
			}
		
		} catch (IOException e) {
			try {
				var empleados = archivos.leerArchivo().split("\n");
				for (int i = 1; i < empleados.length; i++) {
					var nuevoEmpleado = empleados[i].split(";");
					if(Double.parseDouble(nuevoEmpleado[2])<=2000) { 
						empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),10);
					}
					else if(Double.parseDouble(nuevoEmpleado[2])>2000 && Double.parseDouble(nuevoEmpleado[2])<=5000) {
						empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),15);
					
					}
					else if (Double.parseDouble(nuevoEmpleado[2])>5000) {
						empleado[i-1] = new Empleado(nuevoEmpleado[0], nuevoEmpleado[1], Double.parseDouble(nuevoEmpleado[2]),20);
					}
					
					
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void construirEmpleados() {
		try {
			empleado = new Empleado[cantidadRegistros()-1];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int cantidadRegistros() throws IOException {
		var empleados = archivos.leerArchivo().split("\n");
		return empleados.length;
	}
	
	public void guardarEmpleados() {
		try {
			for (int i = 0; i < empleado.length; i++) {
				archivos.escribirArchivo(empleado[i].datosCompletos());
			}
			generarNomina();
	p.escribirPropiedades();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Empleado[] getEmpleado() {
		return empleado;
	}
	public void generarNomina()throws IOException {
		for (int i = 0; i < empleado.length; i++) {
			if (empleado[i].getRetencion()==10) {
			archivos.escribirNomina1(empleado[i].datosCompletos());	
			}
			else if (empleado[i].getRetencion()==15) {
			archivos.escribirNomina2(empleado[i].datosCompletos());
			}
			else if (empleado[i].getRetencion()==20) {
			archivos.escribirNomina3(empleado[i].datosCompletos());
			}
		}
	}
}
