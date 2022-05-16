package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserInfoProxy implements InvocationHandler {
    private Object agentObj;

    public UserInfoProxy(Object target) {
        agentObj = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), agentObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("LOG: recording the execution of " 
                            + method.getName() 
                            + " ===============================");
        Object methodRes = method.invoke(agentObj, args);
        return methodRes;
    }

}
