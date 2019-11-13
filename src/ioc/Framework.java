package ioc;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Framework {

    public static void main(String[] args) throws Exception {

        ClassLoader classLoader=Framework.class.getClassLoader();
        Properties properties=new Properties();
        InputStream in=classLoader.getResourceAsStream("pro.properties");
        properties.load(in);

        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");

        Class aClass = Class.forName(className);
        Object obj = aClass.newInstance();
        Method method=aClass.getMethod(methodName,String.class);
        method.invoke(obj,"food");
    }
}
