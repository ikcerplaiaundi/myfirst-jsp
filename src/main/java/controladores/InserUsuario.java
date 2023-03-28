package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.GBDD;
import modelo.Usuario;

/**
 * Servlet implementation class InserUsuario
 */
@WebServlet("/InserUsuario")
public class InserUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// a que jsp?
				request.getRequestDispatcher("InsertForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GBDD gdbb =new GBDD();
		Usuario usuario = new Usuario();
		
		//abro conexion
		gdbb.abrirConexion();
		//inserto usuarion nuevo
		
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setDni(request.getParameter("dni"));
		usuario.setCodigo(request.getParameter("codigo"));
		
		gdbb.insertarUsusario(usuario);
		//cierro conexion
		gdbb.cerrarConexion();
		//doGet(request, response);
		request.getRequestDispatcher("Mandardata").forward(request, response);
	}

}
