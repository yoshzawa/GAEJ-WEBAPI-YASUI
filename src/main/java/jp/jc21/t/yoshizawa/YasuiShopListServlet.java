package jp.jc21.t.yoshizawa;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.jc21.t.yoshizawa.ofy.Item;

/**
 * Servlet implementation class yasuiServlet
 */
@WebServlet("/yasui/ShopList")
public class YasuiShopListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String shopName = request.getParameter("SHOPNAME");
		shopName=(shopName==null)?"":shopName;
		String result = null;
		
		List<Item> results = Item.getlistByShopName(shopName);
		System.out.println(results.size());
		
		for(Item r:results) {
			System.out.println(r.itemName);
			System.out.println(r.shopName);
			System.out.println("-----");
		}
		request.setAttribute("Items", results);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/yasui.jsp");
		rd.forward(request, response);

	}

}