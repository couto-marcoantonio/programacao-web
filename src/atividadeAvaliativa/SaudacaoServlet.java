package atividadeAvaliativa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class saudacao
 */
@WebServlet("/saudacaoServlet")
public class SaudacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaudacaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String primeiroNome = "";
		String ultimoNome = "";
		if (request.getParameter("primeiroNome") != null) {
			primeiroNome = request.getParameter("primeiroNome");
		}
		if (request.getParameter("ultimoNome") != null) {
			ultimoNome = request.getParameter("ultimoNome");
		}
		
		response.getWriter().append("Olá ").append(primeiroNome + " " + ultimoNome);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void handleRequest(HttpServletRequest req, HttpServletResponse res) {
		
	}

}
