package de.hub.clickwatch.model.util;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Error;

public class ErrorUtil {

    public static Error createError(String message, Exception exception) {
        Error result = ClickWatchModelFactory.eINSTANCE.createError();
        result.setMessage(message);
        result.setException(exception);
        return result;
    }
}
