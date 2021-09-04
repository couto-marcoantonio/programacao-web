package atividadeAvaliativa;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.util.StringUtils;

/**
 * Servlet implementation class saudacao
 */
@WebServlet("/calculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> parameterNames = request.getParameterNames();
		Integer somaValores = 0;

		while (parameterNames.hasMoreElements()) {
			String paramName = parameterNames.nextElement();
			String valorParamStr = request.getParameter(paramName);
			if (StringUtils.isStrictlyNumeric(valorParamStr)) {
				somaValores += Integer.valueOf(valorParamStr);
			}
		}
		
		response.getWriter().append("A soma dos valores numéricos dos parâmetros é ").append(somaValores.toString());
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
