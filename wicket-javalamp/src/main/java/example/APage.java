package example;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;

import wicket.lavalamp.LavaLampMenuPanel;

public final class APage extends WebPage {
    public APage() {
        add(new LavaLampMenuPanel("lavalampMenu", Utils.newMenuList()) {
            private static final long serialVersionUID = 1L;

            @Override
            protected ResourceReference getCssResourceReference() {
                return new CompressedResourceReference(APage.class, "apage.css");
            }
        });
    }
}
