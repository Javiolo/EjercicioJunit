package ejercicio;

import org.junit.Assert;
import org.junit.Test;

public class Prueba {

	@Test
	public void prueba() {
		PersonaFiscal persona = new PersonaFiscal("Javier", 20, 10000);
		persona.vincularTipoImpuesto("A");
		int calcular = persona.calcularImpuesto();
		Assert.assertEquals(3000, calcular);
	}// gfg
	// hhhh

	@Test
	public void prueba1() {
		PersonaFiscal persona1 = new PersonaFiscal("Javi", 32, 10000);
		persona1.vincularTipoImpuesto("B");
		int calcular = persona1.calcularImpuesto();
		Assert.assertEquals(100000, calcular);
	}

	@Test
	public void prueba2() {
		PersonaFiscal persona2 = new PersonaFiscal("Javier", 21, 165423);
		persona2.vincularTipoImpuesto("C");
		int calcular = persona2.calcularImpuesto();
		Assert.assertEquals(30, calcular);
	}

	@Test
	public void prueba3() {
		PersonaFiscal persona3 = new PersonaFiscal("Javi", 40, 10321646);
		persona3.vincularTipoImpuesto("D");
		int calcular = persona3.calcularImpuesto();
		Assert.assertEquals(1, calcular);
	}

	@Test

	public void prueba4() {
		PersonaFiscal persona4 = new PersonaFiscal("Javi", 40, 10);
		persona4.vincularTipoImpuesto("A");
		int calcular = persona4.calcularImpuesto();
		Assert.assertEquals(2, calcular);
	}

	@Test
	public void prueba5() {
		PersonaFiscal persona5 = new PersonaFiscal("Javi", 32, 100);
		persona5.vincularTipoImpuesto("B");
		int calcular = persona5.calcularImpuesto();
		Assert.assertEquals(1000, calcular);
	}

	@Test
	public void prueba6() {
		PersonaFiscal persona6 = new PersonaFiscal("Javier", 21, 1233);
		persona6.vincularTipoImpuesto("C");
		int calcular = persona6.calcularImpuesto();
		Assert.assertEquals(308, calcular);
	}

	@Test
	public void prueba7() {
		PersonaFiscal persona7 = new PersonaFiscal("Javi", 40, 100);
		persona7.vincularTipoImpuesto("D");
		int calcular = persona7.calcularImpuesto();
		Assert.assertEquals(10, calcular);
	}

}
