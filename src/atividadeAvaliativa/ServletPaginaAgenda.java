package atividadeAvaliativa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuilder html = new StringBuilder();
		html.append("<form method=\"post\">\r\n" + 
				"	Nome: <input type=\"text\" name=\"name\" />\r\n" + 
				"	Telefone: <input type=\"tel\" name=\"phone\" placeholder=\"(00) 0000-0000\" />\r\n" + 
				"	Data de Nascimento: <input type=\"date\" name=\"birthdate\" />\r\n" + 
				"	<input type=\"submit\" value=\"Enviar\">\r\n" + 
				"</form>");
		response.getWriter().append(html.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletAgenda servletAgenda = new ServletAgenda();
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("phone", request.getParameter("phone"));
		request.setAttribute("birthdate", request.getParameter("birthdate"));
		servletAgenda.doGet(request, response);
	}

}
