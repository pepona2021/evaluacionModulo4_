package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import interfaces.PersonaDAO;
import modelo.Persona;


/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     PersonaDAO pDAO = new PersonaDAO();
	        Persona p = null;
	        String idUsuario = "";
	        String accion = request.getParameter("accion");
	        if (accion == null){
	            accion = "verTodos";
	        }

	        switch (accion){
	            case "verUno":
	            	idUsuario = request.getParameter("idUsuario");
	                p = pDAO.readOne(Integer.parseInt(idUsuario));
	                request.setAttribute("p", p);
	                getServletContext().getRequestDispatcher("/view/personaUno.jsp").forward(request, response);
	                break;
	            case "editar":
	            	idUsuario = request.getParameter("idUsuario");
	                p = pDAO.readOne(Integer.parseInt(idUsuario));
	                request.setAttribute("p", p);
	                getServletContext().getRequestDispatcher("/view/editarUsuario.jsp").forward(request, response);
	                break;
				/*
				 * case "Listar":
				 * 
				 * List<Persona>datos=pDAO.readAll(); request.setAttribute("datos", datos);
				 * request.getRequestDispatcher("/view/listadousuario.jsp").forward(request,
				 * response); break;
				 */
	               
	            case "crear":
	            	idUsuario = request.getParameter("idUsuario");
	                p = pDAO.readOne(Integer.parseInt(idUsuario));
	                request.setAttribute("p", p);
	                getServletContext().getRequestDispatcher("/view/listadousuario.jsp").forward(request, response);
	                break;
	                
	                
	                
	                
				/*
				 * case "del": idUsuario = request.getParameter(idUsuario); p =
				 * pDAO.delete(Integer.parseInt(idUsuario)); p.delete(idUsuario);
				 * request.setAttribute("p", p);
				 * getServletContext().getRequestDispatcher("/view/listadousuario.jsp\"").
				 * forward(request, response);
				 * 
				 * break;
				 */
			
	            default:	
	                List<Persona> persona = pDAO.readAll();
	                request.setAttribute("persona", persona);
	                getServletContext().getRequestDispatcher("/view/listadousuario.jsp").forward(request, response);
	                break;
	        }

	    }



	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String accion = request.getParameter("accion");
	        if (accion == null){
	            accion = "verTodos";
	        }

	        PersonaDAO pDAO = new PersonaDAO();

	        switch (accion){
	            case "editar":
	                Persona p = new Persona();
	                p.setIdUsuario(Integer.parseInt(request.getParameter("idUsuario")));
	                p.setRunUsuario(Integer.parseInt(request.getParameter("txtRun")));
	                p.setNomUsuario(request.getParameter("txtNom"));
	                p.setApeUsuario(request.getParameter("txtApe"));
	                p.setFecUsuario(request.getParameter("txtFec"));
	                p.setTipUsuario(request.getParameter("txtTip"));

	              
	                pDAO.update(p);
	                request.removeAttribute("accion");


	                request.setAttribute("accion" , "verTodos");
	                
	                
	                List<Persona> persona = pDAO.readAll();
	                request.setAttribute("persona", persona);
	                getServletContext().getRequestDispatcher("/view/listadousuario.jsp").forward(request, response);


	                break;
	            case "borrar":
	                break;
	            default:
	                doGet(request, response);
	                break;
	        }
	    }
	}