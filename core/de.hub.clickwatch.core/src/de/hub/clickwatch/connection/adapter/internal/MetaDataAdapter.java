package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import click.ControlSocket;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.Throwables;

public class MetaDataAdapter extends AbstractAdapter implements IMetaDataAdapter {

    private boolean ignoreElement(String name) {
        return name.contains("@");
    }

    @Override
    public Node pullAllMetaData() {
        IClickSocket clickSocket = connection.getBlockingSocket();
        if (clickSocket == null || !clickSocket.isConnected()) {
            return null;
        }
        ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;
        Node metaData = modelFactory.createNode();
        metaData.setINetAddress(connection.getNode().getINetAddress());

        Map<String, Element> elementMap = new HashMap<String, Element>();
        List<String> configElementNames = null;
        try {
            configElementNames = clickSocket.getConfigElementNames();

            Collections.sort(configElementNames);

            for (Object elementNameObject : configElementNames) {
                String elementName = elementNameObject.toString();
                if (!ignoreElement(elementName)) {
                    String[] elementPath = elementName.split("/");
                    String elementNamePrefix = null;
                    Element parent = null;
                    for (String elementPathItem : elementPath) {
                        elementNamePrefix = elementNamePrefix == null ? elementPathItem : elementNamePrefix + "/"
                                + elementPathItem;
                        Element element = elementMap.get(elementNamePrefix);
                        if (element == null) {
                            element = modelFactory.createElement();
                            element.setName(elementPathItem);
                            if (parent == null) {
                                metaData.getElements().add(element);
                            } else {
                                parent.getChildren().add(element);
                            }
                            elementMap.put(elementNamePrefix, element);
                        }
                        parent = element;
                    }
                }
            }

            for (String elementPath : configElementNames) {
                if (!ignoreElement(elementPath)) {
                    List<ControlSocket.HandlerInfo> handlerInfos = null;
                    Element element = elementMap.get(elementPath);
                    Preconditions.checkState(element != null);
                    try {
                        handlerInfos = clickSocket.getElementHandlers(elementPath);
                    } catch (Throwable e) {
                        Throwables.propagate(e);
                    }

                    Collections.sort(handlerInfos, new Comparator<ControlSocket.HandlerInfo>() {
                        @Override
                        public int compare(HandlerInfo o1, HandlerInfo o2) {
                            return o1.getHandlerName().compareTo(o2.getHandlerName());
                        }
                    });

                    for (ControlSocket.HandlerInfo handlerInfo : handlerInfos) {
                        Handler newHandler = modelFactory.createHandler();
                        newHandler.setName(handlerInfo.getHandlerName());
                        newHandler.setCanRead(handlerInfo.isCanRead());
                        newHandler.setCanWrite(handlerInfo.isCanWrite());
                        if (newHandler.isCanRead()) {
                            element.getHandlers().add(newHandler);
                        }
                    }
                }
            }
        } catch (Exception e) {
            connection.getAdapter(IErrorAdapter.class).createError("Exception while retrieving meta data", e);
        }

        return metaData;
    }
}
