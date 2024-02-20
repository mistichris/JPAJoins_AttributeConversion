package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListItem;

@WebServlet("/AddItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddItemServlet() {
        super();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String store=request.getParameter("store");
		String item=request.getParameter("item");
		
		ListItem li = new ListItem(store, item);
		ListItemHelper dao = new ListItemHelper();
		dao.insertItem(li);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		
		
		
	}

}
