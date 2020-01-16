package com._520.spring_tx.xml.advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SuppressWarnings("all")
public class JdkAccountServiceProxy implements InvocationHandler {

    // 代理对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public <T>T getProxyObject() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        return null;
    }
}
