package d11_代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactor {

    //维护一个目标对象
    private Object target;

    //构造器
    public ProxyFactor(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
