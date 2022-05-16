package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy pattern: dynamic proxy
 */
public class ProxyTest implements InvocationHandler {
    private Object target;

    public ProxyTest(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // invoke the method
        System.out.println("log is recording: " + method.getDeclaringClass().getName() 
                           + "is calling method " + method.getName());
        Object result = method.invoke(target, args);
        
        return result;
    }
}
