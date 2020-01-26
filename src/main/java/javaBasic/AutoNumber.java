package javaBasic;

import jdk.vm.ci.code.site.Call;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author tf_yuan
 * @description TODO
 * @date 2020/1/26
 */
public class AutoNumber{
    public static void main(String[] args) {
        //1.继承Thread类
        Demo_1 demo_1 = new Demo_1();
        new Thread(demo_1).start();
        //2.实现Runnable接口
        Demo_2 demo_2 = new Demo_2();
        new Thread(demo_2).start();
        //3.callable接口
        FutureTask<Integer> demo_3 = new FutureTask<>(new Demo_3());
        new Thread(demo_3,"demo_3").start();
    }

    static class Demo_1 extends Thread{
        @Override
        public void run(){
            int i =0;
            while (true){
              i++;
            }
        }
    }
    static class Demo_2 implements Runnable{
        @Override
        public void run() {
           int i =0;
           while (true){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               i++;
           }
        }
    }
    static class Demo_3 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int i =0;
            while (true){
                Thread.sleep(1000);
                i++;
            }
        }
    }
}
