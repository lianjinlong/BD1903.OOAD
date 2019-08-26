package com.briup.bigdata.bd1903.ooad.adapter_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 10:25
 **/
public class DuckAdapter implements Duck{
    private Turkey t;

    public DuckAdapter(Turkey t){
        this.t=t;
    }

    @Override
    public void dfly(){
        this.t.tfly();
    }

    @Override
    public void dsay(){
        this.t.tsay();
    }
}
