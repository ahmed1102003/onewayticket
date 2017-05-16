package Auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description="One way ticket to Mars" , urlPatterns={"/Auth"})

public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public login() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at I got it 7: ");
//		if ( request.getParameter("name") != null && request.getParameter("pwd") != null);
//		{
		
//		String user = request.getParameter("userId").toString();
//		String pwd = request.getParameter("pwd").toString();
//		response.getWriter().write("I got the username " + user.toString() + " and the password " + pwd);
//	}
//
		response.getWriter().write(" no userId");	
		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
