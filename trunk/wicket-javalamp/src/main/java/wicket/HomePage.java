package wicket;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;

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
        add(new LavaLampMenuPanel("lavalampMenu") {
            private static final long serialVersionUID = 1L;

            @Override
            protected ResourceReference getCssResourceReference() {
                return new CompressedResourceReference(HomePage.class, "lavalamp.css");
            }
        });
        // Add the simplest type of label
        add(new Label("message",
                "If you see this message wicket is properly configured and running"));
    }
}
