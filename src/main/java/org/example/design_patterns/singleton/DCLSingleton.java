package org.example.design_patterns.singleton;

public class DCLSingleton {
    private static volatile DCLSingleton INSTANCE;
    private DCLSingleton(){}

    public static DCLSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (DCLSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
