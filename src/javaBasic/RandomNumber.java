package javaBasic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            int temp = (int) (Math.random() * 100);
            list.add(temp);
        }
        File file = new File("D:/RandomNumber.txt");
        if (!file.exists()) {
            System.out.println("未在指定目录下找到文件名为“test”的文本文件！正在创建...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("创建成功！");
        } else {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(list)+"\t");
            fileWriter.close();
            System.out.println("写入成功！");
        }

    }
}
