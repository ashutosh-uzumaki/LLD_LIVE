package org.example.design_patterns.structural.composite.menu;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Menu menu = new Menu("Menu");
        Menu vegMenu = new Menu("Veg Menu");
        MenuItem item = new MenuItem("Paneer", "Paneer ki sabzi", BigDecimal.valueOf(250));
        vegMenu.addComponent(item);
        Menu nonVegMenu = new Menu("Non Veg Menu");
        menu.addComponent(vegMenu);
        menu.addComponent(nonVegMenu);
        MenuItem item2 = new MenuItem("Chicken", "Chicken ki sabzi", BigDecimal.valueOf(350));
        nonVegMenu.addComponent(item2);

        System.out.println("==== My Restaurant Menu ====");
        menu.display();
    }
}
