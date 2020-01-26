package javaBasic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/26
 */
public class MaxTest {
    public static void main(String[] args) {
        Class<Max> clazz = null;
        try {
            clazz = (Class<Max>) Class.forName("javaBasic.Max");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert clazz !=null;
            //取得getMax方法
            Method getMaxMethod = clazz.getMethod("getMax", int.class, int.class);
            //取得print方法
            Method printMethod = clazz.getMethod("print");
            getMaxMethod.invoke(clazz.getDeclaredConstructor().newInstance(),3,5);
            printMethod.invoke(clazz.getDeclaredConstructor().newInstance());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
