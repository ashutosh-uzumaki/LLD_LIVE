package org.example.design_patterns.structural.composite.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> components;
    public Menu(String name) {
        super(name);
        components = new ArrayList<MenuComponent>();
    }

    public void addComponent(MenuComponent component) {
        components.add(component);
    }

    public void removeComponent(MenuComponent component) {
        components.remove(component);
    }

    public void display() {
        System.out.println(name);
        for(MenuComponent component : components) {
            component.display();
        }
    }
}
