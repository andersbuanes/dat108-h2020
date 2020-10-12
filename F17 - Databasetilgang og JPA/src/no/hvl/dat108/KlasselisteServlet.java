package no.hvl.dat108;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/klasseliste")
public class KlasselisteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private StudentEAO studentEAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String kode = request.getParameter("kode");
		
		List<Student> klasseliste = studentEAO.hentKlasselisteFor(kode);
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		klasseliste.forEach(out::println);
	}
}


