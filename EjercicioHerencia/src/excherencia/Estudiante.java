package excherencia;

public class Estudiante extends MasterClass{

	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante (String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre,apellido,edad);
		this.codigoEstudiante=codigoEstudiante;
		this.notaFinal=notaFinal;
		
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+getNombre()+getApellido()+
				"\nEdad: "+getEdad()
		      +"\ncodigo de estudiante: "+codigoEstudiante
		      +"\nNota Fina:"+notaFinal );
	}
}
