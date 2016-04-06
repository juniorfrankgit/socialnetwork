package socialnetwork.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import socialnetwork.dao.Dao;
import socialnetwork.dbaccess.*;
import socialnetwork.model.User;
/***
 * This servlet allows to login
 * @author le06
 *
 */
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("login a User");
		DBAccess dba = new DBAccess();
		User user = dba.login(req.getParameter("email1"));
		if(user == null) {
			resp.sendRedirect("/loginError.jsp");
			return;
		}
		req.setAttribute( "user", user);

	    try {
			this.getServletContext().getRequestDispatcher( "/welcome.jsp" ).forward( req, resp );
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
}