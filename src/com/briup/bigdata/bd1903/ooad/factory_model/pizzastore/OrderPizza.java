package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.CheesePizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.ChinesePizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.GreekPizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.PepperPizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza{
    public OrderPizza(){
        Pizza pizza=null;
        String ordertype;

        do{
            ordertype=gettype();

            if(ordertype.equals("cheese")){
                pizza=new CheesePizza();
            }else if(ordertype.equals("greek")){
                pizza=new GreekPizza();
            }else if(ordertype.equals("pepper")){
                pizza=new PepperPizza();
            }else if(ordertype.equals("chinese")){
                pizza=new ChinesePizza();
            }else{
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
