package com.briup.bigdata.bd1903.ooad.adapter_model;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @program: BD1903.OOAD
 * @description: .
 * @author: Kevin
 * @create: 2019-08-21 11:28
 **/
public class IteratorAdapter implements Iterator{
    private Enumeration enumeration;

    public IteratorAdapter(Enumeration enumeration){
        this.enumeration=enumeration;
    }

    @Override
    public boolean hasNext(){
        return this.enumeration.hasMoreElements();
    }

    @Override
    public Object next(){
        return this.enumeration.nextElement();
    }

    @Override
    public void remove(){
        System.out.println("操作无效！");
    }
}
