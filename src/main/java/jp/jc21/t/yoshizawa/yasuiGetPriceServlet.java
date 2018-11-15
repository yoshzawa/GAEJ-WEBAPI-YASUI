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
		String result = null;
		
		Item item=Item.getObjectById(janCode);
		if(item == null) {
			result="FAIL";
		} else {
			result="OK";
		}

		request.setAttribute("Result", result);
		request.setAttribute("Item", item);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/yasuiGetPrice.jsp");
		rd.forward(request, response);
	}

}