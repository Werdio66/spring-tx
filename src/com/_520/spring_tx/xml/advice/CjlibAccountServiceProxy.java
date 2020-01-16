package com._520.spring_tx.xml.advice;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public class CjlibAccountServiceProxy implements InvocationHandler {

    // 代理对象
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 返回代理对象
    public <T>T getProxyObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        return null;
    }
}
