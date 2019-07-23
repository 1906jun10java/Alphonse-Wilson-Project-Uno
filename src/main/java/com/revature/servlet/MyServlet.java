package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.bean.Credentials;
import com.revature.bean.User;
import com.revature.service.AuthenticationService;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private AuthenticationService authService = new AuthenticationService();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out = response.getWriter();
//		out.print("hello world---");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	//	response.sendRedirect("employee");
		response.sendRedirect("manager");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession session = request.getSession();
		// grab credentials from request
		Credentials creds = new Credentials(request.getParameter("username"), request.getParameter("password"));
		User u = authService.authenticateUser(creds);
		if (u != null) {
			// set user information as session attributes (not request attributes)
			session.setAttribute("userId", u.getUserId());
			session.setAttribute("username", u.getUser());
			session.setAttribute("firstname", u.getUser_FirstName());
			session.setAttribute("lastname", u.getUser_LastName());
			session.setAttribute("email", u.getUser_email());
			session.setAttribute("problem", null);
			// resp.getWriter().write("welcome, "+u.getFirstname()+" "+u.getLastname());
			// redirect user to their profile page if authenticated
			response.sendRedirect("employee");
		} else {
			
			// what if the creds are wrong?
			
			session.setAttribute("problem", "invalid credentials");
			
			// Option 1: print a sassy message (not super useful)
			// resp.getWriter().write("invalid credentials, nerd");
			
			// Option 2: redirect back to login
			response.sendRedirect("MyServlet");
			
			// Option 3: send back a status code of 403 and a message
			// TO BE CONTINUED... WHAT IF THERE'S AN ERROR PAGE DEFINED?
			//resp.sendError(403, "invalid credentials");
		}
		
	}

}
