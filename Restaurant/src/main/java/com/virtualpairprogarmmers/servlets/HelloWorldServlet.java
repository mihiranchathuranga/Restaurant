package com.virtualpairprogarmmers.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        out.println("<html><body><h1>Hello World</h1>");		 //put some data to transmit in browser
	    out.println("<p>The time is: " + new Date()  + "</p>");
        out.println("</html></body>"); 
        out.close();
	 
	}
	//two parameters

}
