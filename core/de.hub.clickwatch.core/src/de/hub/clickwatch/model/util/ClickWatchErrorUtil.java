package de.hub.clickwatch.model.util;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchError;

public class ClickWatchErrorUtil {

    public static ClickWatchError createError(String message, Exception exception) {
        ClickWatchError result = ClickWatchModelFactory.eINSTANCE.createClickWatchError();
        result.setMessage(message);
        result.setException(exception);
        return result;
    }
}
