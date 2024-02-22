package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListDetails;

/**
 * Servlet implementation class ViewAllListsServlet
 */
@WebServlet("/viewAllListsServlet")
public class ViewAllListsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ViewAllListsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ListDetailsHelper slh = new ListDetailsHelper();
		List<ListDetails> abc = slh.getLists();
		request.setAttribute("allLists", abc);
		if (abc.isEmpty()) {
			request.setAttribute("allLists", " ");
		}
		getServletContext().getRequestDispatcher("/shopping-list-by-user.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
