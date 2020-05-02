package co.com.udem.nomina.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import co.com.udem.nomina.dto.EmpleadoDTO;


public class LecturaArchivoTest {
	
	

	@Test
	public void testParseEmpleadoDTO() {
		
		
		String registro = "Carlos Andres,Sanchez Flores,222222222,PLANEACION,4000000";
		
		Scanner scanner = new Scanner(registro);
		scanner.useDelimiter(",");
		
		EmpleadoDTO empleadoDTO = LecturaArchivo.getEmpleadoDTO(scanner);
		
		assertEquals("222222222", empleadoDTO.getCedula());
		assertEquals("Sanchez Flores", empleadoDTO.getApellidos());
	}
	
	@Test
	public void testLeerRegistro() {
		
		
		String registro = "Andrea Estefania,Valencia Lopez,333333333,ARQUITECTURA,6000000";
		
		LecturaArchivo.leerRegistro(registro);
		
		assertTrue(PoblarEstructura.getEmpleados().containsKey("333333333"));
	}
	
}
