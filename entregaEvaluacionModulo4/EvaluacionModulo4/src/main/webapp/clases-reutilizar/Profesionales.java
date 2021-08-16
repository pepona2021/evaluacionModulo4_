package modelo;

public class Profesionales {
	
	private int id_Profesionales;
	private int profesional_run;
	private String profesional_Nombre;
	private String profesional_Apellido;
	private String profesional_Telefono;
	private String profesional_Titulo;
	private String profesional_Proyecto;
	private int profesional_ID_Usuario;

	
	public Profesionales() {
		// TODO Esbozo de constructor generado automáticamente
	}


	/**
	 * @param id_Profesionales
	 * @param profesional_run
	 * @param profesional_Nombre
	 * @param profesional_Apellido
	 * @param profesional_Telefono
	 * @param profesional_Titulo
	 * @param profesional_Proyecto
	 * @param profesional_ID_Usuario
	 */
	public Profesionales(int id_Profesionales, int profesional_run, String profesional_Nombre,
			String profesional_Apellido, String profesional_Telefono, String profesional_Titulo,
			String profesional_Proyecto, int profesional_ID_Usuario) {
		super();
		this.id_Profesionales = id_Profesionales;
		this.profesional_run = profesional_run;
		this.profesional_Nombre = profesional_Nombre;
		this.profesional_Apellido = profesional_Apellido;
		this.profesional_Telefono = profesional_Telefono;
		this.profesional_Titulo = profesional_Titulo;
		this.profesional_Proyecto = profesional_Proyecto;
		this.profesional_ID_Usuario = profesional_ID_Usuario;
	}


	/**
	 * @return el id_Profesionales
	 */
	public int getId_Profesionales() {
		return id_Profesionales;
	}


	/**
	 * @param id_Profesionales el id_Profesionales a establecer
	 */
	public void setId_Profesionales(int id_Profesionales) {
		this.id_Profesionales = id_Profesionales;
	}


	/**
	 * @return el profesional_run
	 */
	public int getProfesional_run() {
		return profesional_run;
	}


	/**
	 * @param profesional_run el profesional_run a establecer
	 */
	public void setProfesional_run(int profesional_run) {
		this.profesional_run = profesional_run;
	}


	/**
	 * @return el profesional_Nombre
	 */
	public String getProfesional_Nombre() {
		return profesional_Nombre;
	}


	/**
	 * @param profesional_Nombre el profesional_Nombre a establecer
	 */
	public void setProfesional_Nombre(String profesional_Nombre) {
		this.profesional_Nombre = profesional_Nombre;
	}


	/**
	 * @return el profesional_Apellido
	 */
	public String getProfesional_Apellido() {
		return profesional_Apellido;
	}


	/**
	 * @param profesional_Apellido el profesional_Apellido a establecer
	 */
	public void setProfesional_Apellido(String profesional_Apellido) {
		this.profesional_Apellido = profesional_Apellido;
	}


	/**
	 * @return el profesional_Telefono
	 */
	public String getProfesional_Telefono() {
		return profesional_Telefono;
	}


	/**
	 * @param profesional_Telefono el profesional_Telefono a establecer
	 */
	public void setProfesional_Telefono(String profesional_Telefono) {
		this.profesional_Telefono = profesional_Telefono;
	}


	/**
	 * @return el profesional_Titulo
	 */
	public String getProfesional_Titulo() {
		return profesional_Titulo;
	}


	/**
	 * @param profesional_Titulo el profesional_Titulo a establecer
	 */
	public void setProfesional_Titulo(String profesional_Titulo) {
		this.profesional_Titulo = profesional_Titulo;
	}


	/**
	 * @return el profesional_Proyecto
	 */
	public String getProfesional_Proyecto() {
		return profesional_Proyecto;
	}


	/**
	 * @param profesional_Proyecto el profesional_Proyecto a establecer
	 */
	public void setProfesional_Proyecto(String profesional_Proyecto) {
		this.profesional_Proyecto = profesional_Proyecto;
	}


	/**
	 * @return el profesional_ID_Usuario
	 */
	public int getProfesional_ID_Usuario() {
		return profesional_ID_Usuario;
	}


	/**
	 * @param profesional_ID_Usuario el profesional_ID_Usuario a establecer
	 */
	public void setProfesional_ID_Usuario(int profesional_ID_Usuario) {
		this.profesional_ID_Usuario = profesional_ID_Usuario;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesionales [id_Profesionales=");
		builder.append(id_Profesionales);
		builder.append(", profesional_run=");
		builder.append(profesional_run);
		builder.append(", profesional_Nombre=");
		builder.append(profesional_Nombre);
		builder.append(", profesional_Apellido=");
		builder.append(profesional_Apellido);
		builder.append(", profesional_Telefono=");
		builder.append(profesional_Telefono);
		builder.append(", profesional_Titulo=");
		builder.append(profesional_Titulo);
		builder.append(", profesional_Proyecto=");
		builder.append(profesional_Proyecto);
		builder.append(", profesional_ID_Usuario=");
		builder.append(profesional_ID_Usuario);
		builder.append("]");
		return builder.toString();
	}
	

}
