package wicket.lavalamp;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.behavior.HeaderContributor;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

@SuppressWarnings("serial")
public class LavaLampMenuPanel extends Panel {
    public final String CSS_CLASS_NAME = "lavaLamp";

    public LavaLampMenuPanel(String id) {
        super(id);
        // Add JQuery JS libraries
        add(new JQueryLavaLampBehavior());
        add(CSSPackageResource.getHeaderContribution(JQueryLavaLampBehavior.class,
                "lavalamp.css"));
        add(JavascriptPackageResource.getHeaderContribution(LavaLampMenuPanel.class,
                "headlamp.js"));
        add(new HeaderContributor(new IHeaderContributor() {

            @Override
            public void renderHead(IHeaderResponse response) {
                response.renderCSSReference(getCssResourceReference());
            }
        }));
        final WebMarkupContainer listContainer = new WebMarkupContainer("list");
        listContainer.add(new AttributeAppender("class", true, new Model<String>(
                getCssClassName()), " "));
        IModel<List<String>> model = new AbstractReadOnlyModel<List<String>>() {

            @Override
            public List<String> getObject() {
                final List<String> result = new ArrayList<String>();
                result.add("One Link");
                result.add("Two Link");
                result.add("Three Link");
                result.add("Four Link");
                return result;
            }
        };
        ListView<String> lv = new ListView<String>("lavaLampMenu", model) {
            @Override
            protected void populateItem(ListItem<String> item) {
                String caption = item.getModelObject();
                item.add(new Label("caption", caption));
            }

        };

        listContainer.add(lv);
        add(listContainer);
    }

    /**
     * This method should return the reference for the CSS that will be used.
     * 
     * @return ResourceReference
     */
    protected ResourceReference getCssResourceReference() {
        return new CompressedResourceReference(LavaLampMenuPanel.class, "headlamp.js");
    }

    /**
     * @return String the class name in the CSS file
     */
    protected String getCssClassName() {
        return CSS_CLASS_NAME;
    }

}
