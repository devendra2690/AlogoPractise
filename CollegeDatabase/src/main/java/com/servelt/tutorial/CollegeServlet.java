package com.servelt.tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CollegeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CollegeService collegeService;
	
	@Override
	public void init() throws ServletException {
		// TODO : To initialize your dependency
	   collegeService = new CollegeService();
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO: To implement service logic
		List<Student> students = collegeService.getAllStd();
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<HTML>");
		printWriter.println("<HEAD>Student List</HEAD>");
		printWriter.println("<BODY> This is College Servlet");
		printWriter.println(students);
		printWriter.println("</BODY>");
		printWriter.println("</HTML>");
	}

	
	@Override
	public void destroy() {
		//TODO: cleanup work
		collegeService = null;
	}
}
	