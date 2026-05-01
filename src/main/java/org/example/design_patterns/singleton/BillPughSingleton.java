package org.example.design_patterns.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){

    }

    private static class InstanceHolder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
