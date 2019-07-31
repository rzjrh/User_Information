package com.RezaAk.meritamerica.userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String language = request.getParameter("favoriteLanguage");
		String home = request.getParameter("homeTown");
		String[] info = { firstName , lastName, language, home};
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(info[0] == null || info[1] == null) {
			out.write("<h1>Hello, "+ "Unknown Name" +"</h1>");
		}
		else {
			out.write("<h1>Welcome, "+ info[0] +" "+ info[1] +"</h1>");
		}
		if(info[2] == null) {
			out.write("<h2>User Favorite Language is: "+"Unknown Language"+"</h2>");
		}
		else {
			out.write("<h2>User Favorite Language is: "+info[2]+"</h2>");
		}
		if(info[3] == null) {
			out.write("<h2>User Hometown is: "+"Unknown HomeTown"+"</h2>");
		}
		else {
			out.write("<h2>User Hometown is: "+info[3]+"</h2>");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
