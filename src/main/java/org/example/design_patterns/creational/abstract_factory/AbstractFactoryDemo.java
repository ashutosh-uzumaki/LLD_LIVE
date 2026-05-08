package org.example.design_patterns.creational.abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Theme theme = new LightTheme();
        theme.getButton().render();
        theme.getTextBox().render();
    }
}
