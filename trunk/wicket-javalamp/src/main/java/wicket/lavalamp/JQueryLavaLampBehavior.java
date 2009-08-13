package wicket.lavalamp;

import org.apache.wicket.Application;
import org.apache.wicket.ajax.AbstractDefaultAjaxBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.CompressedResourceReference;

public class JQueryLavaLampBehavior extends AbstractDefaultAjaxBehavior {
	private static final long serialVersionUID = -428199323406701848L;
	public static final CompressedResourceReference JQUERY_JS = new CompressedResourceReference(
			JQueryLavaLampBehavior.class, "jquery.js");
	public static final CompressedResourceReference JQUERY_EASING_JS = new CompressedResourceReference(
			JQueryLavaLampBehavior.class, "jquery.easing.1.1.js");
	public static final CompressedResourceReference JQUERY_LAVALAMP_JS = new CompressedResourceReference(
			JQueryLavaLampBehavior.class, "jquery.lavalamp.js");
	public static final CompressedResourceReference JQUERY_DEBUG_JS = new CompressedResourceReference(
			JQueryLavaLampBehavior.class, "jquery.debug.js");

	public JQueryLavaLampBehavior() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		try {
			super.renderHead(response);
			response.renderJavascriptReference(JQUERY_JS);
			response.renderJavascriptReference(JQUERY_EASING_JS);
			response.renderJavascriptReference(JQUERY_LAVALAMP_JS);
			if (Application.DEVELOPMENT.equals(Application.get().getConfigurationType())) {
				response.renderJavascriptReference(JQUERY_DEBUG_JS);
			}
			CharSequence script = getOnReadyScript();
			if ((script != null) && (script.length() > 0)) {
				StringBuilder builder = new StringBuilder();
				builder.append("<script type=\"text/javascript\">\n$(document).ready(function(){\n");
				builder.append(script);
				builder.append("\n});</script>");
				response.renderString(builder.toString());
			}
		} catch (RuntimeException exc) {
			throw exc;
		} catch (Exception exc) {
			throw new RuntimeException("wrap: " + exc.getMessage(), exc);
		}
	}

	protected CharSequence getOnReadyScript() {
		return null;
	}

	@Override
	protected void respond(AjaxRequestTarget target) {
		// TODO Auto-generated method stub

	}

}
