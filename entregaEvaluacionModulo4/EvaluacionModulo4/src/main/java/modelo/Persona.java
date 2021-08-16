package modelo;

public class Persona {
	
	private int idUsuario;
	private int runUsuario;
	private String nomUsuario;
	private String apeUsuario;
	private String fecUsuario;
	private String tipUsuario;

	public Persona() {
		// TODO Esbozo de constructor generado automáticamente
	}

	/**
	 * @param idUsuario
	 * @param runUsuario
	 * @param nomUsuario
	 * @param apeUsuario
	 * @param fecUsuario
	 * @param tipUsuario
	 */
	public Persona(int idUsuario, int runUsuario, String nomUsuario, String apeUsuario, String fecUsuario,
			String tipUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.runUsuario = runUsuario;
		this.nomUsuario = nomUsuario;
		this.apeUsuario = apeUsuario;
		this.fecUsuario = fecUsuario;
		this.tipUsuario = tipUsuario;
	}

	/**
	 * @return el idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario el idUsuario a establecer
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return el runUsuario
	 */
	public int getRunUsuario() {
		return runUsuario;
	}

	/**
	 * @param runUsuario el runUsuario a establecer
	 */
	public void setRunUsuario(int runUsuario) {
		this.runUsuario = runUsuario;
	}

	/**
	 * @return el nomUsuario
	 */
	public String getNomUsuario() {
		return nomUsuario;
	}

	/**
	 * @param nomUsuario el nomUsuario a establecer
	 */
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	/**
	 * @return el apeUsuario
	 */
	public String getApeUsuario() {
		return apeUsuario;
	}

	/**
	 * @param apeUsuario el apeUsuario a establecer
	 */
	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}

	/**
	 * @return el fecUsuario
	 */
	public String getFecUsuario() {
		return fecUsuario;
	}

	/**
	 * @param fecUsuario el fecUsuario a establecer
	 */
	public void setFecUsuario(String fecUsuario) {
		this.fecUsuario = fecUsuario;
	}

	/**
	 * @return el tipUsuario
	 */
	public String getTipUsuario() {
		return tipUsuario;
	}

	/**
	 * @param tipUsuario el tipUsuario a establecer
	 */
	public void setTipUsuario(String tipUsuario) {
		this.tipUsuario = tipUsuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idUsuario=");
		builder.append(idUsuario);
		builder.append(", runUsuario=");
		builder.append(runUsuario);
		builder.append(", nomUsuario=");
		builder.append(nomUsuario);
		builder.append(", apeUsuario=");
		builder.append(apeUsuario);
		builder.append(", fecUsuario=");
		builder.append(fecUsuario);
		builder.append(", tipUsuario=");
		builder.append(tipUsuario);
		builder.append("]");
		return builder.toString();
	}
	
}