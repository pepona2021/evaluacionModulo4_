package interfaces;

import java.util.List;

import modelo.Persona;

public interface IPersonaDAO {
	
	public void create(Persona p);
	public List<Persona> readAll();	
	public Persona readOne(int idUsuario);
	public void update(Persona p);
	public void delete(Persona p);
	public void delete(int idUsuario);
}
