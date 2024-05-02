package org.wei.design.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    private final Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("代理执行");
            Object returnValue = method.invoke(target,args); // 执行目标方法
            System.out.println("代理结束");
            return returnValue;
        });
    }
}
