package aug_21;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@SuppressWarnings("serial")
@WebServlet("/Details")
public class Details extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String Name=req.getParameter("nm");
		String Age=req.getParameter("age");
		String Mobile=req.getParameter("mb");
		String Gender=req.getParameter("r1");
		String [] hobbies=req.getParameterValues("c1");
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.println("==========Details============");
		writer.println("<br>Name:"+Name);
		writer.println("<br>Age:"+Age);
		writer.println("<br>Mobile Number:"+Mobile);
		writer.println("<br>Gender:"+Gender);
		writer.println("<br>Hobbies:");
		for(int i=0;i<hobbies.length;i++)
		{
		   writer.println(""+hobbies[i]);
		}
	}

}
