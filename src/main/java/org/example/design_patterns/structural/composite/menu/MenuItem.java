package org.example.design_patterns.structural.composite.menu;

import java.math.BigDecimal;

public class MenuItem extends MenuComponent {
    private String description;
    private BigDecimal price;

    public MenuItem(String name, String description, BigDecimal price) {
        super(name);
        this.description = description;
        this.price = price;
    }

    public void display() {
        System.out.println(name+": "+description+": "+price);
    }
}
