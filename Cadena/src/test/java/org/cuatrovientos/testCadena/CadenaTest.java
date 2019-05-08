package org.cuatrovientos.testCadena;

import static org.junit.Assert.*;

import org.cuatrovientos.cadena.Cadena;
import org.junit.Before;
import org.junit.Test;

public class CadenaTest {
	
	private Cadena target;
	
	@Before
	public void setUp() throws Exception {
		target = new Cadena();
	}
	
	@Test
	public void testLongitud() {
		int expected = 5;
		int actual = target.longitud("david");
		assertEquals("Testing length", expected, actual);
		assertEquals("Testing length", "", "");
	}
	
	@Test
	public void testVocales() {
		int expected = 2;
		int actual = target.vocales("david");
		assertEquals("Testing vowels", expected,actual);
		assertEquals("Testing vowels", "", "");
	}
	
	@Test
	public void testInvertir() {
		String expected = "divad";
		String actual = target.invertir("david");
		assertEquals("Testing invert",expected,actual);
		assertEquals("Testing invert", "", "");
	}
	
	@Test
	public void testContarLetra() {
		int expected = 2;
		int actual = target.contarLetra("david", 'd');
		assertEquals("Testing count",expected,actual);
		assertEquals("Testing count", "", "");
	}

}
