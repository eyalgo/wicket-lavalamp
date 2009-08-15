package example;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;

import wicket.lavalamp.LavaLampMenuPanel;

public final class APage extends WebPage {
    private final String CSS_CLASS_NAME = "lavaLamp";
    public APage() {
        add(new LavaLampMenuPanel("lavalampMenu", Utils.newMenuList()) {
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
    }
}
