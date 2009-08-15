package example;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.link.PopupSettings;

import wicket.lavalamp.MenuItem;

final class Utils {

    private Utils() {
        throw new IllegalStateException();
    }

    public static List<MenuItem> newMenuList() {
        final List<MenuItem> result = new ArrayList<MenuItem>();
        result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

            @Override
            public void onClick() {
            // TODO Auto-generated method stub

            }

        }, new Label(MenuItem.CAPTION_ID, "One")));

        final BookmarkablePageLink<Object> linkToAPage = new BookmarkablePageLink<Object>(
                MenuItem.LINK_ID, APage.class);
        result.add(new MenuItem(linkToAPage, new Label(MenuItem.CAPTION_ID, "APage")));

        final BookmarkablePageLink<Object> linkToAPageWithPopupSettings = new BookmarkablePageLink<Object>(
                MenuItem.LINK_ID, APage.class);
        linkToAPageWithPopupSettings.setPopupSettings(new PopupSettings());
        result.add(new MenuItem(linkToAPageWithPopupSettings, new Label(MenuItem.CAPTION_ID,
                "APage-popup")));

        result.add(new MenuItem(new Link<Object>(MenuItem.LINK_ID) {

            @Override
            public void onClick() {
            // TODO Auto-generated method stub

            }

        }, new Label(MenuItem.CAPTION_ID, "Four")));
        return result;
    }

}
