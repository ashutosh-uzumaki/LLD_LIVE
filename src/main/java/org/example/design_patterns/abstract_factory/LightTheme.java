package org.example.design_patterns.abstract_factory;

public class LightTheme implements Theme{
    @Override
    public Button getButton(){
        return new LightButton();
    }

    @Override
    public TextBox getTextBox(){
        return new LighttextBox();
    }
}
