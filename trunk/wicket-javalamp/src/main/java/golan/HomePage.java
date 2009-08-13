package golan;

import golan.main.JQueryLavaLampBehavior;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private static final long serialVersionUID = 1L;

	// TODO Add any page properties or variables here

    /**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HomePage(final PageParameters parameters) {
    	add(new JQueryLavaLampBehavior());
    	add(CSSPackageResource.getHeaderContribution(JQueryLavaLampBehavior.class, "lavalamp.css"));
    	add(JavascriptPackageResource.getHeaderContribution(HomePage.class, "headlamp.js"));
        // Add the simplest type of label
        add(new Label("message", "If you see this message wicket is properly configured and running"));

        // TODO Add your page's components here
    }
}
