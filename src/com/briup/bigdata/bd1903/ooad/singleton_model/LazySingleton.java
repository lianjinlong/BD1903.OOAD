package com.briup.bigdata.bd1903.ooad.singleton_model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: BD1903.OOAD
 * @description: .单例模式——懒汉式
 * @author: Kevin
 * @create: 2019-08-21 09:21
 **/
public class LazySingleton{
    public static void main(String[] args){
        // new Thread(()->{
        //     Util u=Util.getInstance();
        //     System.out.println(u);
        // }).start();
        //
        // new Thread(()->{
        //     Util u=Util.getInstance();
        //     System.out.println(u);
        // }).start();
        //
        // new Thread(()->{
        //     Util u=Util.getInstance();
        //     System.out.println(u);
        // }).start();
        //
        // Util u1=Util.getInstance();
        // System.out.println(u1);



        new Thread(()->{
            Tool t=Tool.t;
            System.out.println(t);
        }).start();

        new Thread(()->{
            Tool t=Tool.t;

            try{
                Class<Tool> tc=Tool.class;
                Constructor<Tool> c=tc.getDeclaredConstructor();
                c.setAccessible(true);
                t=c.newInstance();
            }catch(NoSuchMethodException e){
                e.printStackTrace();
            }catch(IllegalAccessException e){
                e.printStackTrace();
            }catch(InstantiationException e){
                e.printStackTrace();
            }catch(InvocationTargetException e){
                e.printStackTrace();
            }

            System.out.println(t);
        }).start();

        new Thread(()->{
            Tool t=Tool.t;
            System.out.println(t);
        }).start();

        new Thread(()->{
            Tool t=Tool.t;
            System.out.println(t);
        }).start();

        Tool t=Tool.t;
        System.out.println(t);
    }
}



// 饿汉式
class Tool{
    public final static Tool t=new Tool();
    private Tool(){}
}

// 懒汉式
class Util{
    // 类变量用于接收创建的本类的对象
    // 在定义类变量时不进行初始化
    private static Util u;

    // 构造器私有化
    private Util(){}

    // 提供公共的访问方式
    public static Util getInstance(){
        if(u==null){
            synchronized(Lock.LOCK_A){
                if(u==null){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    u=new Util();
                }
            }
        }
        return u;
    }
}
