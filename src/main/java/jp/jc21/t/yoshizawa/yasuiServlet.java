package jp.jc21.t.yoshizawa;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;

import jp.jc21.t.yoshizawa.ofy.Item;
import jp.jc21.t.yoshizawa.ofy.OfyHelper;

/**
 * Servlet implementation class yasuiServlet
 */
@WebServlet("/yasui")
public class yasuiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public yasuiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Item> items = Item.getlist();
		request.setAttribute("Items", items);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/yasui.jsp");
		rd.forward(request, response);
	}

}
