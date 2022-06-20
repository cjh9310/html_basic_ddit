package kr.or.ddit.web;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class HelloServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws IOException, ServletException
	{
		String html = "<html>";
		html += "<body>";
		html += "<h4>welcome, server time : "+ new Date() +"</h4>";
		html += "<div id='area1'></div>";
		html += "<script>";
		html += "document.getElementById('area1').innerHTML= new Date();";
		html += "</script>";
		html += "</body>";
		html += "</html>";
		PrintWriter out = resp.getWriter();
		out.println(html);
		out.close();
	
	}
}