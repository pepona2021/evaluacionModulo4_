package modelo;

public class Administrativos {

	private int id_Administrativo;
	private int administrativo_Run;
	private	String administrativo_Nombre;
	private String administrativo_Apellido;
	private String administrativo_Correo;
	private String administrativo_Area;
	private int administrativo_ID_Usuario;

	public Administrativos() {
		// TODO Esbozo de constructor generado automáticamente
	}

	/**
	 * @param id_Administrativo
	 * @param administrativo_Run
	 * @param administrativo_Nombre
	 * @param administrativo_Apellido
	 * @param administrativo_Correo
	 * @param administrativo_Area
	 * @param administrativo_ID_Usuario
	 */
	public Administrativos(int id_Administrativo, int administrativo_Run, String administrativo_Nombre,
			String administrativo_Apellido, String administrativo_Correo, String administrativo_Area,
			int administrativo_ID_Usuario) {
		super();
		this.id_Administrativo = id_Administrativo;
		this.administrativo_Run = administrativo_Run;
		this.administrativo_Nombre = administrativo_Nombre;
		this.administrativo_Apellido = administrativo_Apellido;
		this.administrativo_Correo = administrativo_Correo;
		this.administrativo_Area = administrativo_Area;
		this.administrativo_ID_Usuario = administrativo_ID_Usuario;
	}

	/**
	 * @return el id_Administrativo
	 */
	public int getId_Administrativo() {
		return id_Administrativo;
	}

	/**
	 * @param id_Administrativo el id_Administrativo a establecer
	 */
	public void setId_Administrativo(int id_Administrativo) {
		this.id_Administrativo = id_Administrativo;
	}

	/**
	 * @return el administrativo_Run
	 */
	public int getAdministrativo_Run() {
		return administrativo_Run;
	}

	/**
	 * @param administrativo_Run el administrativo_Run a establecer
	 */
	public void setAdministrativo_Run(int administrativo_Run) {
		this.administrativo_Run = administrativo_Run;
	}

	/**
	 * @return el administrativo_Nombre
	 */
	public String getAdministrativo_Nombre() {
		return administrativo_Nombre;
	}

	/**
	 * @param administrativo_Nombre el administrativo_Nombre a establecer
	 */
	public void setAdministrativo_Nombre(String administrativo_Nombre) {
		this.administrativo_Nombre = administrativo_Nombre;
	}

	/**
	 * @return el administrativo_Apellido
	 */
	public String getAdministrativo_Apellido() {
		return administrativo_Apellido;
	}

	/**
	 * @param administrativo_Apellido el administrativo_Apellido a establecer
	 */
	public void setAdministrativo_Apellido(String administrativo_Apellido) {
		this.administrativo_Apellido = administrativo_Apellido;
	}

	/**
	 * @return el administrativo_Correo
	 */
	public String getAdministrativo_Correo() {
		return administrativo_Correo;
	}

	/**
	 * @param administrativo_Correo el administrativo_Correo a establecer
	 */
	public void setAdministrativo_Correo(String administrativo_Correo) {
		this.administrativo_Correo = administrativo_Correo;
	}

	/**
	 * @return el administrativo_Area
	 */
	public String getAdministrativo_Area() {
		return administrativo_Area;
	}

	/**
	 * @param administrativo_Area el administrativo_Area a establecer
	 */
	public void setAdministrativo_Area(String administrativo_Area) {
		this.administrativo_Area = administrativo_Area;
	}

	/**
	 * @return el administrativo_ID_Usuario
	 */
	public int getAdministrativo_ID_Usuario() {
		return administrativo_ID_Usuario;
	}

	/**
	 * @param administrativo_ID_Usuario el administrativo_ID_Usuario a establecer
	 */
	public void setAdministrativo_ID_Usuario(int administrativo_ID_Usuario) {
		this.administrativo_ID_Usuario = administrativo_ID_Usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Administrativos [id_Administrativo=");
		builder.append(id_Administrativo);
		builder.append(", administrativo_Run=");
		builder.append(administrativo_Run);
		builder.append(", administrativo_Nombre=");
		builder.append(administrativo_Nombre);
		builder.append(", administrativo_Apellido=");
		builder.append(administrativo_Apellido);
		builder.append(", administrativo_Correo=");
		builder.append(administrativo_Correo);
		builder.append(", administrativo_Area=");
		builder.append(administrativo_Area);
		builder.append(", administrativo_ID_Usuario=");
		builder.append(administrativo_ID_Usuario);
		builder.append("]");
		return builder.toString();
	}
	

}
