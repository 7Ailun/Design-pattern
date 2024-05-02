package org.wei.design.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    public Object getInstance(Object target) {
        // 创建 Enhancer 工具类
        Enhancer enhancer = new Enhancer();
        // 设置目标对象的超类，即代理类的超类应该继承自目标类的超类。
        enhancer.setSuperclass(target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * obj  目标类的实例
     * method   目标方法的反射对象
     * args  方法的参数
     * methodProxy 代理类的实例
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理开始");
        Object returnValue = methodProxy.invokeSuper(obj, objects);
        System.out.println("cglib代理结束");
        return returnValue;
    }
}
