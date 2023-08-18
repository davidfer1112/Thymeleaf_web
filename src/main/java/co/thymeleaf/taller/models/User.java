package co.thymeleaf.taller.models;


public class User {

	private String nombre;
	private String apellido;
	private String fecha_nacimiento;
    private String edad;
	
	
	
	public User(String nombre, String apellido, String fecha_nacimiento, String edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public String getEdad() {
		return edad;
	}
	
	
}
