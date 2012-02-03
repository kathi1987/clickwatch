package de.hub.clickwatch.datamodel.util;

import de.hub.clickwatch.datamodel.ClickWatchError;
import de.hub.clickwatch.datamodel.ClickWatchModelFactory;

public class ClickWatchErrorUtil {

    public static ClickWatchError createError(String message, Exception exception) {
        ClickWatchError result = ClickWatchModelFactory.eINSTANCE.createClickWatchError();
        result.setMessage(message);
        result.setException(exception);
        return result;
    }
}
