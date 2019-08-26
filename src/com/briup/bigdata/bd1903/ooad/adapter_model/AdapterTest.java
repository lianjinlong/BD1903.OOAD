package com.briup.bigdata.bd1903.ooad.adapter_model;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 10:27
 **/
public class AdapterTest{
    public static void main(String[] args){
        GreenHeadDuck ghd=new GreenHeadDuck();
        ghd.dfly();
        ghd.dsay();

        System.out.println("--------------------");
        WildTurkey wt=new WildTurkey();
        wt.tfly();
        wt.tsay();

        // System.out.println("-----------------");
        // DuckAdapter da=new DuckAdapter(wt);
        // da.dfly();
        // da.dsay();
        // System.out.println(da instanceof Duck);

        DuckAdapter2 da2=new DuckAdapter2();
        da2.dfly();
        da2.dsay();

        System.out.println(da2 instanceof Duck);

    }
}
