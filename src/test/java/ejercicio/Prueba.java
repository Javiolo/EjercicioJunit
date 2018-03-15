package ejercicio;

import org.junit.Assert;
import org.junit.Test;

public class Prueba {

	@Test
	public void prueba() {
		Persona_Fiscal persona = new Persona_Fiscal("Javier", 20, 10000);
		persona.vincularTipoImpuesto("A");
		int calcular = persona.calcularImpuesto();
		Assert.assertEquals(3000, calcular);
	}

	@Test
	public void prueba1() {
		Persona_Fiscal persona1 = new Persona_Fiscal("Javi", 32, 100);
		persona1.vincularTipoImpuesto("B");
		int calcular = persona1.calcularImpuesto();
		Assert.assertEquals(10, calcular);
	}

	@Test
	public void prueba2() {
		Persona_Fiscal persona2 = new Persona_Fiscal("Javier", 21, 123);
		persona2.vincularTipoImpuesto("C");
		int calcular = persona2.calcularImpuesto();
		Assert.assertEquals(30, calcular);
	}

	@Test
	public void prueba3() {
		Persona_Fiscal persona3 = new Persona_Fiscal("Javi", 40, 10);
		persona3.vincularTipoImpuesto("D");
		int calcular = persona3.calcularImpuesto();
		Assert.assertEquals(1, calcular);
	}

	@Test

	public void prueba4() {
		Persona_Fiscal persona4 = new Persona_Fiscal("Javi", 40, 10);
		persona4.vincularTipoImpuesto("A");
		int calcular = persona4.calcularImpuesto();
		Assert.assertEquals(2, calcular);
	}

	@Test
	public void prueba5() {
		Persona_Fiscal persona5 = new Persona_Fiscal("Javi", 32, 100);
		persona5.vincularTipoImpuesto("B");
		int calcular = persona5.calcularImpuesto();
		Assert.assertEquals(10, calcular);
	}

	@Test
	public void prueba6() {
		Persona_Fiscal persona6 = new Persona_Fiscal("Javier", 21, 1233);
		persona6.vincularTipoImpuesto("C");
		int calcular = persona6.calcularImpuesto();
		Assert.assertEquals(308, calcular);
	}

	@Test
	public void prueba7() {
		Persona_Fiscal persona7 = new Persona_Fiscal("Javi", 40, 100);
		persona7.vincularTipoImpuesto("D");
		int calcular = persona7.calcularImpuesto();
		Assert.assertEquals(10, calcular);
	}

}
