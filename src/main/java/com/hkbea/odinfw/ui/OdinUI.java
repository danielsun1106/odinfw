package com.hkbea.odinfw.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SpringUI
public class OdinUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        setContent(new Button("Click me", e -> Notification.show("Hello, Odin Framework!")));
    }
}