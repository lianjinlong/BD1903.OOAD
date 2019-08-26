package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.absfactory;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.LDCheesePizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.LDPepperPizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String ordertype){
        Pizza pizza=null;

        if(ordertype.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
