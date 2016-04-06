package socialnetwork.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import socialnetwork.model.*;
import socialnetwork.dao.Dao;
import socialnetwork.dbaccess.*;
/***
 * This servlet allow to add a new user in the db
 * @author le06
 *
 */
@SuppressWarnings("serial")
public class CreateUserServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("Creating new user ");
		DBAccess dba = new DBAccess();
		User user = dba.newAccount(req.getParameter("lastname"), req.getParameter("firstname"), 
		req.getParameter("email2"), req.getParameter("password2"));
		req.setAttribute( "user", user);
		try {
			this.getServletContext().getRequestDispatcher( "/welcome.jsp" ).forward( req, resp );
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
	}
}
