package com.servlet.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyServlet() {
        super();
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String method = request.getMethod();
		if(method.equals("POST")) {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			if(id.equals("abcd") && pw.equals("0000")) {
			response.sendRedirect("/day03_task/page1.jsp");
			}else {
				response.sendRedirect("/day03_task/login.jsp");
			}
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}	
		
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
