package ejemplos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploDeDato
 */
@WebServlet("/EjemploDeDato")
public class EjemploDeDato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploDeDato() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//con un if para que no se ejecute en default (cuando recive datos)
		String[] datos ={"false","false","false"};
		
		for (String dato : datos) {
			int i =0;
			dato = request.getParameter("datos"+i) ;
			System.out.println(dato);
			i++;
		}
		
		//else  default (cuando no se reciven datos)
		
		
		request.setAttribute("datos", datos);
		int id = 1;
		
		request.setAttribute("id", id);
		
		
		

		
		
		request.getRequestDispatcher("hola.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
