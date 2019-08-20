package com.simpleproject.user;

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
			if(firstName == null) {
			firstName = "unknown";
			}
		String lastName = request.getParameter("lastName");
			if(lastName == null) {
			lastName = "unknown";
			}
		String homeTown = request.getParameter("homeTown");
			if(homeTown == null) {
			homeTown = "unknown";
			}
		String favoriteLanguage = request.getParameter("favoriteLanguage");
			if(favoriteLanguage == null) {
			favoriteLanguage = "unknown";
			}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
		out.write("<p>Your favorite language is: " + favoriteLanguage + "</p>");
		out.write("<p>Your hometown is: " + homeTown + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
