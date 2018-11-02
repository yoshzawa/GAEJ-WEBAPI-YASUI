package jp.jc21.t.yoshizawa;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.ObjectifyService;

import jp.jc21.t.yoshizawa.ofy.Item;
import jp.jc21.t.yoshizawa.ofy.OfyHelper;

/**
 * Servlet implementation class yasuiServlet
 */
@WebServlet("/yasui/getPrice")
public class yasuiGetPriceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public yasuiGetPriceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String janCode = request.getParameter("JAN");
		janCode=(janCode==null)?"":janCode;
//		List<Item> items = ObjectifyService.ofy().load().type(Item.class).
//				filter("janCode = ", janCode).list();
		List<Item> items = ObjectifyService.ofy().load().type(Item.class).
				filterKey(KeyFactory.createKey("Item", janCode)).list();
		String result = null;
		if(items.size() == 1) {
			result="OK";
		} else {
			result="FAIL";
			items=null;
		}
		request.setAttribute("Result", result);
		request.setAttribute("Items", items);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/yasuiGetPrice.jsp");
		rd.forward(request, response);
	}

}
