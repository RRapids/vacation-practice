package javaBasic;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/17
 */
public class RandomAccess {
    public static void main(String[] args) throws IOException {
        String path = "D:\\javastudy\\work\\data.txt";
        int pointe = 0;
        RandomAccessFile raf = new RandomAccessFile(path, "r");
        //获取RandomAccessFile对象文件指针的位置，初始位置是0
        System.out.println("RandomAccessFile文件指针的初始位置:" + raf.getFilePointer());
        //移动文件指针位置
        raf.seek(pointe);
        byte[] buff = new byte[1024];
        //用于保存实际读取的字节数
        int hasRead = 0;
        //循环读取
        while ((hasRead = raf.read(buff)) > 0) {
            System.out.println(new String(buff, 0, hasRead));
        }
    }
}
