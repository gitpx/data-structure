package com.px.linkedlist.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cl = Proxy.class;
        Object o = cl.newInstance();
        Method[] declaredMethods = cl.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            declaredMethods[i].invoke(o,null);
        }
        System.out.println("华丽的分割线-----------------------------");
        Method[] methods = cl.getMethods();
        for (int i = 0; i < methods.length; i++) {

            System.out.println("获取的方法名："+methods[i].getName());
            methods[i].invoke(o,null);
        }
    }
}

class Proxy{
    String name = "proxy";

    public void run(){
        System.out.println("hello:"+name);
    }
}
