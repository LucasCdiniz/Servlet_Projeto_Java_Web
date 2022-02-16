package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	// doPost - n�o recebe requisi��es Get, n�o ir� conseguir informar os dados diretamente pela url exemplo "?nome=Lucas"
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");
		
		//o m�todo getParameter sempre retorna uma String
		String nomeEmpresa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>"
				+ "<body>"
				+ "Empresa " + nomeEmpresa + " cadastrada com sucesso!"
				+ "</body>"
				+ "</html>");
	}

}
