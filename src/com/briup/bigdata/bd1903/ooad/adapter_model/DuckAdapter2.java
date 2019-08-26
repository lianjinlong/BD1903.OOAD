package com.briup.bigdata.bd1903.ooad.adapter_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 11:13
 **/
public class DuckAdapter2 extends WildTurkey implements Duck{
    @Override
    public void dfly(){
        this.tfly();
    }

    @Override
    public void dsay(){
        this.tsay();
    }
}
