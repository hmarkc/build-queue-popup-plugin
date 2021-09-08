package cz.mendelu.xotradov;

import hudson.Extension;
import hudson.widgets.Widget;

import org.apache.log4j.Logger;

/**
 * SimpleQueueWidget replaces the default BuildQueueWidget and adds arrows to each buildable item.
 */
@SuppressWarnings("unused") //justification: used because of the @Extension below
@Extension(ordinal=199)
public class SimpleQueueWidget extends Widget {
    private final static Logger logger = Logger.getLogger(SimpleQueueWidget.class);

    public String htmlToString(String html) {
        logger.debug(html);
        String message = html.replace("<br>", " \\n ");
        logger.debug(message);
        return message;
    }
}
