package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.absfactory;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza{
    AbsFactory mFactory;

    public OrderPizza(AbsFactory mFactory){

        setFactory(mFactory);
    }

    public void setFactory(AbsFactory mFactory){
        Pizza pizza;
        String ordertype;

        this.mFactory=mFactory;

        do{
            ordertype=gettype();
            pizza=mFactory.CreatePizza(ordertype);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while(true);
    }

    private String gettype(){
        try{
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return strin.readLine();
        }catch(IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
