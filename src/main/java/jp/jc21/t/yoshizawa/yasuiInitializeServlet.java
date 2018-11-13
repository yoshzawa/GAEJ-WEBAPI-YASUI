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
@WebServlet("/yasui/init")
public class yasuiInitializeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public yasuiInitializeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Item item1 = new Item("4948872414739","PlayStation4　Pro　ジェット・ブラック　1TB　CUH-7200BB01"
				,"https://www.yamada-denkiweb.com/1178162019",43167);
		item1.save();
		Item item2 = new Item("49815443","ハインツ イエローマスタード 逆さボトル 226g"
				,"https://www.kenko.com/P8389764/p.html",268);
		item2.save();
	}

}
