package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
/*
 * WC creates an empty HashMap(at application deployment time) 
	to maintain the request mappings
 * Key - /test1
 * Value - com.cdac.pages.FirstServlet  (F.Q servlet class name)
 * 
 */
@WebServlet("/test1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	public void init() throws ServletException {
		System.out.println("in init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in doGet");
		// 1. set resp content type
		response.setContentType("text/html");
		// 2. Get PrintWriter to send text resp from servlet ---> client
		try (PrintWriter pw = response.getWriter()) {
			pw.print("<h5> Welcome 2 Sevlets @ Server Time " 
		+ LocalDateTime.now() + "</h5>"); // resp is added to the
																								// buffer of PW
		} // JVM(WC) - pw.close() --> resp contents (resp body) --> 
		//WC --> WS -->send it  the web clnt

	}

}
