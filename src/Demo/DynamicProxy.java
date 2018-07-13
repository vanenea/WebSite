package Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	private Object obj;
	
	public DynamicProxy(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		Object oobj = method.invoke(obj, args);
		return oobj;
	}

	public static void main(String[] args) {
		WhiteCloud wc = new WhiteCloud();
		InvocationHandler dp = new DynamicProxy(wc);
		
		Cloud newProxyInstance = (Cloud) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(), new Class[] {Cloud.class}, dp);
		newProxyInstance.color("white");
	}
}
