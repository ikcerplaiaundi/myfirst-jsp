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
 * Servlet implementation class ModUsuario
 */
@WebServlet("/ModUsuario")
public class ModUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GBDD gdbb =new GBDD();
		Usuario usuario= new Usuario();
		usuario.setId(Integer.parseInt(request.getParameter("id")));
		
		gdbb.abrirConexion();
		 usuario = gdbb.mostrarUsuario(usuario.getId());
		gdbb.cerrarConexion();
		// enviar datos
		request.setAttribute("usuario", usuario);
		// a que jsp?
		
		request.getRequestDispatcher("ModForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GBDD gdbb =new GBDD();
		Usuario usuario = new Usuario();
		
		//inserto usuario nuevo
		
		usuario.setId(Integer.parseInt(request.getParameter("id")));
		
		usuario.setNombre(request.getParameter("nombre"));
		
		usuario.setDni(request.getParameter("dni"));
		
		usuario.setCodigo(request.getParameter("codigo"));
				
		//abro conexion
		gdbb.abrirConexion();
		
		gdbb.modificarUsuario(usuario);
		
		//cierro conexion
		gdbb.cerrarConexion();
		
		response.sendRedirect("ModUsuario?id="+usuario.getId());
		
		
	}

}
