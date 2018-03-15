package ejercicio;

public class PersonaFiscal {

	private String nombre;
	private int edad;
	private int sueldo;
	TipoImpuesto impuesto;

	public PersonaFiscal(String _nombre, int _edad, int _sueldo) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sueldo = _sueldo;
	}

	public void vincularTipoImpuesto(String _tipo) {
		if (_tipo.equals("A")) {
			this.impuesto = new TipoImpuesto(20, 30, "A");
		} else if (_tipo.equals("B")) {
			this.impuesto = new TipoImpuesto(10, 5, "B");
		} else if (_tipo.equals("C")) {
			this.impuesto = new TipoImpuesto(30, 25, "C");
		} else if (_tipo.equals("D")) {
			this.impuesto = new TipoImpuesto(10, 30, "D");
		}
	}

	public TipoImpuesto getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(TipoImpuesto _impuesto) {
		this.impuesto = _impuesto;
	}

	public int calcularImpuesto() {
		if (this.edad < 30) {
			return (this.sueldo * this.impuesto.getPorcentaje30()) / 100; // para llamar a porcentaje seria
																			// this.impuesto.getPorcentaje30()
		} else {
			return (this.sueldo * this.impuesto.getPorcentaje()) / 100;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String _nombre) {
		this.nombre = _nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int _edad) {
		this.edad = _edad;
	}

	public int getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(int _sueldo) {
		this.sueldo = _sueldo;
	}

}
