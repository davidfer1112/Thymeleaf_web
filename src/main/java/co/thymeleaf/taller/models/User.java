package co.thymeleaf.taller.models;


public class User {

	private String nombre;
	private String apellido;
	private String fecha_nacimiento;
    private int edad;
	
	
	
	public User(String nombre, String apellido, String fecha_nacimiento, int edad) {
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
	public int getEdad() {
		return edad;
	}
	
	
}
