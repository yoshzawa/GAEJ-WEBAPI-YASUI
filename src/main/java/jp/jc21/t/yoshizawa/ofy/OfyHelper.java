package jp.jc21.t.yoshizawa.ofy;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class OfyHelper implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		Item.register();
	}

	public void contextDestroyed(ServletContextEvent event) {
		// App Engine does not currently invoke this method.
	}
}
