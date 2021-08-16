package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.LoginAcceso;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * HttpSession session = request.getSession(); LoginAcceso usuario1
		 * =(LoginAcceso) session.getAttribute("usuario");
		 * 
		 */
		/*
		 * if(usuario1 == null) {
		 * getServletContext().getRequestDispatcher("/login.jsp").forward(request,
		 * response); }else {
		 * 
		 * getServletContext().getRequestDispatcher("/contacto.jsp").forward(request,
		 * response); }
		 */
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String mensaje = request.getParameter("mensaje");
		
		System.out.println(MsjContacto(nombre,email,telefono,mensaje));
		getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
		
	}
     public String MsjContacto(String nom, String email, String tel, String msj) {
		
	  	String mensaje = "Nombre: "+nom+"\nEmail: "+email+"\n"
				+"Teléfono: "+tel+"\nMensaje: "+msj;
		
		return mensaje;
	}
	
}
