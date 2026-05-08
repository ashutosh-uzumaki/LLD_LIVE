package org.example.design_patterns.creational.abstract_factory;

public class LighttextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Light textBox");
    }
}
