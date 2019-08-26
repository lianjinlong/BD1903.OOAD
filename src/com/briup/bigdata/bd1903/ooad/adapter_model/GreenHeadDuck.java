package com.briup.bigdata.bd1903.ooad.adapter_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 10:21
 **/
public class GreenHeadDuck implements Duck{
    @Override
    public void dfly(){
        System.out.println("绿头鸭非的远而且低！");
    }

    @Override
    public void dsay(){
        System.out.println("绿头鸭嘎嘎叫！");
    }
}
