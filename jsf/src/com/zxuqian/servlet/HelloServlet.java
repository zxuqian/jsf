package com.zxuqian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/greeting")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setBufferSize(8192);
		PrintWriter out = response.getWriter();
		// then write the data of the response
		out.println("<html lang=\"zh-CN\">"
		+ "<head><title>Servlet Hello</title></head>");
		// then write the data of the response
		out.println("<body bgcolor=\"#ffffff\">"
			+ "<form method=\"get\">"
			+ "<h2>我叫xuqian，你呢？</h2>"
			+ "<input title=\"我的名字是: \"type=\"text\" "
			+ "name=\"username\" size=\"25\">"
			+ "<p></p>"
			+ "<input type=\"submit\" value=\"Submit\">"
			+ "<input type=\"reset\" value=\"Reset\">"
			+ "</form>");
		String username = request.getParameter("username");
		if (username != null && username.length() > 0) {
			RequestDispatcher dispatcher =
					getServletContext().getRequestDispatcher("/response");
			if (dispatcher != null) {
				dispatcher.include(request, response);
			}
		}
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
