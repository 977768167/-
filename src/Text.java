import reflect.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Text {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("reflect.Person");
//        System.out.println(cls);
//
//        System.out.println(Person.class);

        Field[] fields = cls.getDeclaredFields();

        for (Field field:fields) {
            System.out.println(field);
        }

        Field field=cls.getDeclaredField("name");
        field.setAccessible(true);
        Person p=new Person();
        Object value = field.get(p);
        System.out.println(value);

        field.set(p,"张三");
        System.out.println(p.toString());
        ////////////////////////////////////////////////////////////////
        System.out.println("--------------------------------------------------");
        Method[] methods=cls.getDeclaredMethods();
        for (Method m:methods) {
            System.out.println(m);
        }

        Method eat = cls.getDeclaredMethod("eat", String.class);
        eat.invoke(p,"饭");
        System.out.println("--------------------------------------------------");

        Constructor<?>[] constructors = cls.getDeclaredConstructors();

        for (Constructor c:constructors) {
            System.out.println(c);
        }

    }
}
