package socialnetwork.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		dba.newAccount(req.getParameter("lastname"), req.getParameter("firstname"), 
				req.getParameter("email"), req.getParameter("password"));
		resp.sendRedirect("/newAccountCreated.jsp");
	}
}
