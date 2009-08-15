package example;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;

import wicket.lavalamp.LavaLampMenuPanel;

public final class BPage extends WebPage {

    public BPage() {
        add(new LavaLampMenuPanel("lavalampMenu", Utils.newMenuListWithLinkStyles()) {
            private static final long serialVersionUID = 1L;

            @Override
            protected ResourceReference getCssResourceReference() {
                return new CompressedResourceReference(BPage.class, "bpage.css");
            }
        });
    }

}
