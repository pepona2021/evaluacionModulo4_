package modelo;

public class Cliente {
	
	private int rutCliente;
	private String cliRazon_Social;
	private String cliDireccion;
	private String cliComuna;
	private String cliTefefono;
	private int cliCantidad_Empleados;
	private int usuario_IDUsuario;
	
	
	
	public Cliente() {
		// TODO Esbozo de constructor generado automáticamente
	}
	/**
	 * @param rutCliente
	 * @param cliRazon_Social
	 * @param cliDireccion
	 * @param cliComuna
	 * @param cliTefefono
	 * @param cliCantidad_Empleados
	 * @param usuario_IDUsuario
	 */
	public Cliente(int rutCliente, String cliRazon_Social, String cliDireccion, String cliComuna, String cliTefefono,
			int cliCantidad_Empleados, int usuario_IDUsuario) {
		super();
		this.rutCliente = rutCliente;
		this.cliRazon_Social = cliRazon_Social;
		this.cliDireccion = cliDireccion;
		this.cliComuna = cliComuna;
		this.cliTefefono = cliTefefono;
		this.cliCantidad_Empleados = cliCantidad_Empleados;
		this.usuario_IDUsuario = usuario_IDUsuario;
	}
	/**
	 * @return el rutCliente
	 */
	public int getRutCliente() {
		return rutCliente;
	}
	/**
	 * @param rutCliente el rutCliente a establecer
	 */
	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
	 * @return el cliRazon_Social
	 */
	public String getCliRazon_Social() {
		return cliRazon_Social;
	}
	/**
	 * @param cliRazon_Social el cliRazon_Social a establecer
	 */
	public void setCliRazon_Social(String cliRazon_Social) {
		this.cliRazon_Social = cliRazon_Social;
	}
	/**
	 * @return el cliDireccion
	 */
	public String getCliDireccion() {
		return cliDireccion;
	}
	/**
	 * @param cliDireccion el cliDireccion a establecer
	 */
	public void setCliDireccion(String cliDireccion) {
		this.cliDireccion = cliDireccion;
	}
	/**
	 * @return el cliComuna
	 */
	public String getCliComuna() {
		return cliComuna;
	}
	/**
	 * @param cliComuna el cliComuna a establecer
	 */
	public void setCliComuna(String cliComuna) {
		this.cliComuna = cliComuna;
	}
	/**
	 * @return el cliTefefono
	 */
	public String getCliTefefono() {
		return cliTefefono;
	}
	/**
	 * @param cliTefefono el cliTefefono a establecer
	 */
	public void setCliTefefono(String cliTefefono) {
		this.cliTefefono = cliTefefono;
	}
	/**
	 * @return el cliCantidad_Empleados
	 */
	public int getCliCantidad_Empleados() {
		return cliCantidad_Empleados;
	}
	/**
	 * @param cliCantidad_Empleados el cliCantidad_Empleados a establecer
	 */
	public void setCliCantidad_Empleados(int cliCantidad_Empleados) {
		this.cliCantidad_Empleados = cliCantidad_Empleados;
	}
	/**
	 * @return el usuario_IDUsuario
	 */
	public int getUsuario_IDUsuario() {
		return usuario_IDUsuario;
	}
	/**
	 * @param usuario_IDUsuario el usuario_IDUsuario a establecer
	 */
	public void setUsuario_IDUsuario(int usuario_IDUsuario) {
		this.usuario_IDUsuario = usuario_IDUsuario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [rutCliente=");
		builder.append(rutCliente);
		builder.append(", cliRazon_Social=");
		builder.append(cliRazon_Social);
		builder.append(", cliDireccion=");
		builder.append(cliDireccion);
		builder.append(", cliComuna=");
		builder.append(cliComuna);
		builder.append(", cliTefefono=");
		builder.append(cliTefefono);
		builder.append(", cliCantidad_Empleados=");
		builder.append(cliCantidad_Empleados);
		builder.append(", usuario_IDUsuario=");
		builder.append(usuario_IDUsuario);
		builder.append("]");
		return builder.toString();
	}
	
}
