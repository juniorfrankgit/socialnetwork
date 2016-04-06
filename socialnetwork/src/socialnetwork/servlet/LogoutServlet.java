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
public class LogoutServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("logout a User");
		resp.sendRedirect("/login.jsp");
	}
}