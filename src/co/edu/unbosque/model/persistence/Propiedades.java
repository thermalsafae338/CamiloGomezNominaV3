package co.edu.unbosque.model.persistence;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class Propiedades {
private Properties p = new Properties();
public String leerPopiedades() throws IOException {
 String salida = "";
 File f = new File("nomina.properties");
 p.load(new FileInputStream(f));
 salida += p.getProperty("proyecto")+"\n";
 salida += p.getProperty("numArchivoSalida")+"\n";
 salida += p.getProperty("maxRegistros")+"\n";
 salida += p.getProperty("archivoInferior")+"\n";
 salida += p.getProperty("archivoMedio")+"\n";
 salida += p.getProperty("archivoSuperior")+"\n";
 return salida;
 
}
public void escribirPropiedades()throws IOException {
File f = new File("nomina.properties");
p.setProperty("proyecto", "ESTEBANGOMEZARCHIVOS");
p.setProperty("numArchivoSalida", "3");
p.setProperty("maxRegistros", "30");
p.setProperty("archivoInferior", "Nomina1.txt");
p.setProperty("archivoMedio", "Nomina2.txt");
p.setProperty("archivoSuperior", "Nomina3.txt");
p.store(new FileWriter(f), null);


}

}

