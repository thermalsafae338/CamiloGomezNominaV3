package co.edu.unbosque.model.persistence;

import java.io.*;

public class Archivos {
	
	public String leerArchivo() throws IOException {
		String total = "";
		File f = new File("Datos.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
			String pastLine = line;
			total += pastLine + "\n";
			line = br.readLine();
		}
		br.close();
		return total;
		
	}
	public void escribirArchivo(String data) throws IOException {
		File f = new File("Datos.csv");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(data);
		pw.close();
	}
	public void escribirNomina1(String data) throws IOException {
		File f = new File("Nomina1.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(data);
		pw.close();
		
	}
	public void escribirNomina2(String data) throws IOException {
		File f = new File("Nomina2.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(data);
		pw.close();
	}
	public void escribirNomina3(String data) throws IOException {
		File f = new File("Nomina3.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(data);
		pw.close();
	}
}
