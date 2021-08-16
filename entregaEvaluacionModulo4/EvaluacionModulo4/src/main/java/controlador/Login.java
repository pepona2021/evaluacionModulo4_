package controlador;

import javax.servlet.*;
import javax.servlet.http.*;

import modelo.LoginAcceso;

import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
@WebServlet(name ="login", value = "/login")
public class Login extends HttpServlet {
	
       
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("txtNombre");
        String password = request.getParameter("txtPass");
        
        if(username.equals("admin")&& password.equals("1234")) {
        	//creo una cookie con el nombre del usuario
        	LoginAcceso usuario1 = new LoginAcceso(username, password, "felicitaciones!!!!");
        	HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario1);
	        getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
        }else {
        	getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}    
    }

}