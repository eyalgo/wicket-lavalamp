package wicket;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import wicket.lavalamp.LavaLampMenuPanel;

/**
 * Homepage
 */
public class HomePage extends WebPage {
    /**
     * Constructor that is invoked when page is invoked without a session.
     * 
     * @param parameters
     *            Page parameters
     */
    public HomePage(final PageParameters parameters) {
        add(new LavaLampMenuPanel("lavalampMenu"));
        // Add the simplest type of label
        add(new Label("message",
                "If you see this message wicket is properly configured and running"));
    }
}
