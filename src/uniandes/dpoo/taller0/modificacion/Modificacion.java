package uniandes.dpoo.taller0.modificacion;

import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public static void main(String[] args) { 
		/*
		 * Parte 1: Hola, mundo!
		 */
		System.out.println("Hola, mundo!");
		
		/*
		 * Parte 2: País con más medallistas.
		 */
		CalculadoraEstadisticas calc;
		
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (IOException e) {
			calc = null;
		}
		
		if (calc != null) {
			Map<String, Integer> mapPais = calc.paisConMasMedallistas();
			
			String mapString = mapPais.toString();
			int tamano = mapString.length() - 5;
			String pais = mapString.substring(1, tamano);
			
			
			System.out.println("El país con más medallistas es: "+pais);
		} else {
			System.out.println("ERROR: No se pudo cargar el archivo. Reitenténtelo.");
		}
	}
}
