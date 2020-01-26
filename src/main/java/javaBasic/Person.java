package javaBasic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/26
 */
public class Person {
    private String id;
    private String name;
    private String phone;

    public Person(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[] args){
        Class personTest = Person.class;
        //调用所有构造方法
        Constructor[] constructors = personTest.getConstructors();
        //打印每一个构造方法全限定名和参数类型
        for (Constructor i:constructors ) {
            System.out.println(i.getName()+"("+ Arrays.toString(i.getParameterTypes())+")");
        }
//        //调用某一个构造方法
//        Constructor constructor = null;//参数类型
//        try {
//            constructor = personTest.getConstructor(String.class);
//            Object obj = constructor.newInstance("alice");
//            System.out.println(obj.getClass().getName());
//            System.out.println(obj);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }

    }

}
