package com.px.linkedlist;

public class singolDemo {
    private static volatile singolDemo singol = null;
    private singolDemo(){};

    public singolDemo getInstance(){
        if(singol == null){
            synchronized (singolDemo.class){
                if(singol == null){
                    singol = new singolDemo();
                }
            }
        }
        return singol;
    }
}
