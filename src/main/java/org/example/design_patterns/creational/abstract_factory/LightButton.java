package org.example.design_patterns.creational.abstract_factory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Light Button");
    }
}
