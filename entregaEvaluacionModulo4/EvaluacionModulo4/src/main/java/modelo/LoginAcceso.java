package modelo;

public class LoginAcceso {
    private String nombre;
    private String nombreReal;
    private String pass;

    public LoginAcceso(String nombre, String pass, String nombreReal) {
        this.nombre = nombre;
        this.pass = pass;
        this.nombreReal = nombreReal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    
    
}
