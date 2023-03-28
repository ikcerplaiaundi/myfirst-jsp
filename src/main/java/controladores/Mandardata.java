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
 * Servlet implementation class Mandardata
 */
@WebServlet("/Mandardata")
public class Mandardata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Mandardata() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GBDD gdbb =new GBDD();
		
		
		gdbb.abrirConexion();
		ArrayList <Usuario> usuarios = gdbb.mostrarArrayUsuario();
		gdbb.cerrarConexion();
		// enviar datos
		request.setAttribute("usuarios", usuarios);
		// a que jsp?
		request.getRequestDispatcher("Principal.jsp").forward(request, response);

		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		GBDD gdbb =new GBDD();
		String idString = request.getParameter("id");
		if(idString!=null) {
			gdbb.abrirConexion();
			gdbb.eliminarUsusario(Integer.parseInt(idString));
			gdbb.cerrarConexion();
		}
		doGet(request, response);
		
	}

}
