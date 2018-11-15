package jp.jc21.t.yoshizawa.ofy;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;

@WebListener
public class OfyHelper implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		Item.register();
	}

	public void contextDestroyed(ServletContextEvent event) {
		// App Engine does not currently invoke this method.
	}
}
