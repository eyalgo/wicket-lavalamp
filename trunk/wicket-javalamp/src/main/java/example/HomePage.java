package example;

import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

import wicket.lavalamp.LavaLampMenuPanel;
import wicket.lavalamp.MenuItem;

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
        IModel<List<MenuItem>> model = new AbstractReadOnlyModel<List<MenuItem>>() {

            private static final long serialVersionUID = 1L;

            @Override
            public List<MenuItem> getObject() {
                return Utils.newMenuList();
            }
        };

        add(new LavaLampMenuPanel("lavalampMenu", model) {
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
