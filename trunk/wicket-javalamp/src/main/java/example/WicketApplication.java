package example;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;


/**
 * Application object for your web application. If you want to run this application without deploying, run the Start
 * class.
 * 
 * @see wicket.Start#main(String[])
 */
public class WicketApplication extends WebApplication {
	/**
	 * Constructor
	 */
	public WicketApplication() {
	}
	
	@Override
	protected void init() {
	    mountBookmarkablePage("/home", HomePage.class);
	    mountBookmarkablePage("/a", APage.class);
	    mountBookmarkablePage("/b", BPage.class);
	}

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
		return HomePage.class;
	}

}
