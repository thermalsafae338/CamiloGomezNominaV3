package co.edu.unbosque.model;

public class Empleado{
	
	private String nombre, documento;
	private double salario;
    private int retencion;
	
	public Empleado(String nombre, String documento, double salario,int retencion) {
		this.nombre = nombre; this.documento = documento; this.salario = salario;this.retencion = retencion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getRetencion() {
		return retencion;
	}

	public void setRetencion(int retencion) {
		this.retencion = retencion;
	}

	public String getDocumento() {
		return documento;
	}

	public double getSalario() {
		return salario;
	}
	
	public String datosCompletos() {
		return documento+"\t"+nombre+"\t"+salario;
	}
}
