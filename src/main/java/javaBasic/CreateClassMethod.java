package javaBasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

/**
 * @author tf_yuan
 * @description 使用四种方法创建对象
 * @date 2020/1/26
 */
public class CreateClassMethod implements Cloneable{
    //1.new 关键字
    Student student = new Student();
    //2.使用Class类的newInstance方法
//    Student student2 = Student.class.newInstance();
    //3.使用Clone方法
//    Student student3 = (Student) Student.clone();
    //4.使用反序列化
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
    Student student4 = (Student) in.readObject();

    public CreateClassMethod() throws IOException, ClassNotFoundException {
    }
}
