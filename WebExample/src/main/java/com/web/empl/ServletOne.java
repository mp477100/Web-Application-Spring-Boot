package com.web.empl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletOne extends GenericServlet{

	
	public void service(ServletRequest request,ServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		out.println("Welcome to the World of Servlet");
		out.println("Servlet are Simpler");
	}
}