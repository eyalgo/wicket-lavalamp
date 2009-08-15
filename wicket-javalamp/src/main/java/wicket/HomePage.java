package wicket;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;

import wicket.lavalamp.LavaLampMenuPanel;
import wicket.lavalamp.MenuItem;

/**
 * Homepage
 */
public class HomePage extends WebPage {
    public final String CSS_CLASS_NAME = "lavaLamp";

    /**
     * Constructor that is invoked when page is invoked without a session.
     * 
     * @param parameters
     *            Page parameters
     */
    public HomePage(final PageParameters parameters) {
        IModel<List<MenuItem>> model = new AbstractReadOnlyModel<List<MenuItem>>() {

            @Override
            public List<MenuItem> getObject() {
                final List<MenuItem> result = new ArrayList<MenuItem>();
                result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

                    @Override
                    public void onClick() {
                    // TODO Auto-generated method stub

                    }

                }, new Label(MenuItem.CAPTION_ID, "One")));
                result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

                    @Override
                    public void onClick() {
                    // TODO Auto-generated method stub

                    }

                }, new Label(MenuItem.CAPTION_ID, "Two")));
                result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

                    @Override
                    public void onClick() {
                    // TODO Auto-generated method stub

                    }

                }, new Label(MenuItem.CAPTION_ID, "Three")));
                result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

                    @Override
                    public void onClick() {
                    // TODO Auto-generated method stub

                    }

                }, new Label(MenuItem.CAPTION_ID, "Four")));
                return result;
            }
        };

        add(new LavaLampMenuPanel("lavalampMenu", model) {
            private static final long serialVersionUID = 1L;

            @Override
            protected ResourceReference getCssResourceReference() {
                return new CompressedResourceReference(HomePage.class, "lavalamp.css");
            }

            @Override
            protected String getCssClassName() {
                return CSS_CLASS_NAME;
            }
        });
        // Add the simplest type of label
        add(new Label("message",
                "If you see this message wicket is properly configured and running"));
    }
}
