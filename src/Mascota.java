
public class Mascota {
	
	private String nombre;

	private String color;

	private int patas;


	public Mascota(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MandarMensaje() {

		System.out.println("Soy xxx, te voy a contar algo o no...soy de color xxx");

		System.out.println("Hola equipo! Soy xxxx y te voy a contar algo o no");

	}

}
