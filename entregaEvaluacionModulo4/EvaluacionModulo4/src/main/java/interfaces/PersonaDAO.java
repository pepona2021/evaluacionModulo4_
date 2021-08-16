package interfaces;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import modelo.Conexion;
import modelo.Persona;



public class PersonaDAO implements IPersonaDAO{

	@Override
	public void create(Persona p) {
		String sql = "insert into ronald.usuario1 (ID_USUARIO, RUN_USUARIO, NOMBRE_USUARIO, APELLIDO_USUARIO, FECHA_NAC_USUARIO, TIPO_USUARIO "+
				"values (" + p.getIdUsuario() + ", " + p.getRunUsuario() + ", '" + p.getNomUsuario() + "', '" + p.getApeUsuario() + "', '" +
				p.getFecUsuario() + "', '" + p.getTipUsuario()  + "'";

        try {
            Connection cn = Conexion.getInstance();
            Statement s = cn.createStatement();
            cn.setAutoCommit(true);
            s.execute(sql);
            s.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL INSERTAR");
            ex.printStackTrace();
        }

    }

	@Override
	public List<Persona> readAll() {
		List<Persona> lista = new ArrayList<Persona>();	
		 try {

	            Connection cn = Conexion.getInstance();
	            Statement s = cn.createStatement();
	            String sql = "select * from ronald.usuario";

	            ResultSet rs = s.executeQuery(sql);

	            while (rs.next()){
	                lista.add(new Persona(rs.getInt("ID_USUARIO"),
				                		  rs.getInt("RUN_USUARIO"),
				                		  rs.getString("NOMBRE_USUARIO"),
				                          rs.getString("APELLIDO_USUARIO"),
				                          rs.getString("FECHA_NAC_USUARIO"),
				                          rs.getString("TIPO_USUARIO")));

	            }

	        } catch (SQLException e) {
	            System.out.println("ERROR AL CONSULTAR TODOS LOS EMPLEADOS");
	            e.printStackTrace();
	        }
	        return lista;
	    }

	@Override
	public Persona readOne(int idUsuario) {
		Persona p = null;

        String sql = "select ID_USUARIO, RUN_USUARIO, NOMBRE_USUARIO, APELLIDO_USUARIO, FECHA_NAC_USUARIO, TIPO_USUARIO from ronald.usuario " +
                "where ID_USUARIO = " + idUsuario;

        try {
            Connection cn = Conexion.getInstance();
            Statement s = cn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                p = new Persona(rs.getInt("ID_USUARIO"), rs.getInt("RUN_USUARIO"), rs.getString("NOMBRE_USUARIO"),
                        rs.getString("APELLIDO_USUARIO"),
                        rs.getString("FECHA_NAC_USUARIO"),
                        rs.getString("TIPO_USUARIO"));
            }


        } catch (SQLException ex) {
            System.out.println("ERROR AL LEER UN EMPLEADO");
            ex.printStackTrace();
        }
        return p;
    }

	@Override
	public void update(Persona p) {
		
        String sql = "update ronald.usuario set RUN_USUARIO = " + p.getRunUsuario() + ", NOMBRE_USUARIO='" + p.getNomUsuario() + "', APELLIDO_USUARIO = '" +
                p.getApeUsuario() + "', FECHA_NAC_USUARIO = '" + p.getFecUsuario() + "', TIPO_USUARIO = '" + p.getTipUsuario() + "' " +
                "where ID_USUARIO = " + p.getIdUsuario();

        System.out.println(sql);
        try {
            Connection cn = Conexion.getInstance();
            Statement s = cn.createStatement();
            cn.setAutoCommit(true);
            s.executeQuery(sql);
            s.close();
        } catch (SQLException ex) {
            System.out.println("ERROR AL ACTUALIZAR UN EMPLEADO");
            ex.printStackTrace();
        }
    }

	@Override
	public void delete(Persona p) {
		delete(p.getIdUsuario());
		
	}

	@Override
	public void delete(int idUsuario) {
		 String sql = "delete from ronald.usuario where ID_USUARIO = '" + idUsuario + "'";
	        try{

	            Connection cn = Conexion.getInstance();
	            Statement s = cn.createStatement();
	            cn.setAutoCommit(true);
	            s.execute(sql);
	            s.close();

	        } catch (Exception e){
	            System.out.println("ERROR AL BORRAR Persona");
	            e.printStackTrace();
	        }
	    }
	}