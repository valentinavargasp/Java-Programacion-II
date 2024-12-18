
public class Persona {

	//Atributos
	
	private String nombre;
	private int edad;
	
	//Metodos
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	Persona() {
	
	}
	
	public String getNombre() {
		return nombre; //cuando tengo un método distinto de void si o si uso el return
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public void imprimir() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Edad:" + edad);
	}

	public void esMayorEdad() {
		if (edad >= 18) {
			System.out.print(nombre + " es mayor de edad.");
		} else {
			System.out.print(nombre + " no es mayor de edad.");
		}
	}


	
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Ana");
		p.setEdad(15);
		p.imprimir();
		p.esMayorEdad();
		
		Persona p2 = new Persona();
		p2.setNombre("Lucía");
		p2.setEdad(19);
		p2.imprimir();
		p2.esMayorEdad();

	}

}
