package jp.jc21.t.yoshizawa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.jc21.t.yoshizawa.ofy.Item;

/**
 * Servlet implementation class yasuiServlet
 */
@WebServlet("/yasui/init")
public class yasuiInitializeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		new Item("4960999670010","インクタンク BCI-326GY グレー" , 
				"https://www.askul.co.jp/p/3244270/",1030).save();
	}

}
