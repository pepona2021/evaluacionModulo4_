package modelo;



public class Capacitacion {
	
	private String idCap;
	private String capFecha;
	private String capHora;
	private String capLugar;
	private int capDuracion;
	private int cantidadASistentes;
	private int cliente_rutCliente;
	/**
	 * 
	 */
	public Capacitacion() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}
	/**
	 * @param idCap
	 * @param capFecha
	 * @param capHora
	 * @param capLugar
	 * @param capDuracion
	 * @param cantidadASistentes
	 * @param cliente_rutCliente
	 */
	public Capacitacion(String idCap, String capFecha, String capHora, String capLugar, int capDuracion,
			int cantidadASistentes, int cliente_rutCliente) {
		super();
		this.idCap = idCap;
		this.capFecha = capFecha;
		this.capHora = capHora;
		this.capLugar = capLugar;
		this.capDuracion = capDuracion;
		this.cantidadASistentes = cantidadASistentes;
		this.cliente_rutCliente = cliente_rutCliente;
	}
	/**
	 * @return el idCap
	 */
	public String getIdCap() {
		return idCap;
	}
	/**
	 * @param idCap el idCap a establecer
	 */
	public void setIdCap(String idCap) {
		this.idCap = idCap;
	}
	/**
	 * @return el capFecha
	 */
	public String getCapFecha() {
		return capFecha;
	}
	/**
	 * @param capFecha el capFecha a establecer
	 */
	public void setCapFecha(String capFecha) {
		this.capFecha = capFecha;
	}
	/**
	 * @return el capHora
	 */
	public String getCapHora() {
		return capHora;
	}
	/**
	 * @param capHora el capHora a establecer
	 */
	public void setCapHora(String capHora) {
		this.capHora = capHora;
	}
	/**
	 * @return el capLugar
	 */
	public String getCapLugar() {
		return capLugar;
	}
	/**
	 * @param capLugar el capLugar a establecer
	 */
	public void setCapLugar(String capLugar) {
		this.capLugar = capLugar;
	}
	/**
	 * @return el capDuracion
	 */
	public int getCapDuracion() {
		return capDuracion;
	}
	/**
	 * @param capDuracion el capDuracion a establecer
	 */
	public void setCapDuracion(int capDuracion) {
		this.capDuracion = capDuracion;
	}
	/**
	 * @return el cantidadASistentes
	 */
	public int getCantidadASistentes() {
		return cantidadASistentes;
	}
	/**
	 * @param cantidadASistentes el cantidadASistentes a establecer
	 */
	public void setCantidadASistentes(int cantidadASistentes) {
		this.cantidadASistentes = cantidadASistentes;
	}
	/**
	 * @return el cliente_rutCliente
	 */
	public int getCliente_rutCliente() {
		return cliente_rutCliente;
	}
	/**
	 * @param cliente_rutCliente el cliente_rutCliente a establecer
	 */
	public void setCliente_rutCliente(int cliente_rutCliente) {
		this.cliente_rutCliente = cliente_rutCliente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capacitacion [idCap=");
		builder.append(idCap);
		builder.append(", capFecha=");
		builder.append(capFecha);
		builder.append(", capHora=");
		builder.append(capHora);
		builder.append(", capLugar=");
		builder.append(capLugar);
		builder.append(", capDuracion=");
		builder.append(capDuracion);
		builder.append(", cantidadASistentes=");
		builder.append(cantidadASistentes);
		builder.append(", cliente_rutCliente=");
		builder.append(cliente_rutCliente);
		builder.append("]");
		return builder.toString();
	}
	
	
}


