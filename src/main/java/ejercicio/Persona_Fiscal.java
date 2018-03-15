package ejercicio;

public class Persona_Fiscal {
	private String nombre;
	private int edad;
	private int sueldo;
	Tipo_Impuesto impuesto;

	public Persona_Fiscal(String _nombre, int _edad, int _sueldo) {
		this.nombre = _nombre;
		this.edad = _edad;
		this.sueldo = _sueldo;
	}

	public int calcularPuesto() {
		return 0;
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
