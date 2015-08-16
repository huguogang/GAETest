package guestbook;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class ObjectifyHelper implements ServletContextListener {
	public void contextInitialized(ServletContextEvent event) {
		ObjectifyService.register(Guestbook.class);
		ObjectifyService.register(Greeting.class);
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		
	}
}