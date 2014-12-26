package com.edsc.portafolio;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Portafolio_241214_tempServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world. I'm david santiago, developer Java SE/EE...");
	}
}
