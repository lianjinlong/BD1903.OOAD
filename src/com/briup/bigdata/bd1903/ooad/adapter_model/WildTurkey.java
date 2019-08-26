package com.briup.bigdata.bd1903.ooad.adapter_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 10:22
 **/
public class WildTurkey implements Turkey{
    @Override
    public void tfly(){
        System.out.println("野生火鸡飞的近但是高！！！");
    }

    @Override
    public void tsay(){
        System.out.println("野生火鸡 咕咕 叫！！！");
    }
}


