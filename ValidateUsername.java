package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUsername
 */

@WebServlet("/validateServ")
public class ValidateUsername extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private List<String> usernameList;
	@Override
	public void init(ServletConfig config) throws ServletException {
		usernameList = new ArrayList<String>();
		
		usernameList.add("bhavana");
		usernameList.add("john");
		usernameList.add("alex");
	}
	
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("validate username");
		String username = request.getParameter("username");
		PrintWriter out= response.getWriter();
		
		
		if(usernameList.contains(username))
		{
			out.println("<font color='red'> Username already exists </font>");
			
		}
		
		else{
			out.println("<font color='green'> Username is available </font>");
		}
	}

}
