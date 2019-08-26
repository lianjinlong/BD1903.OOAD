package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.absfactory;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.NYCheesePizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.NYPepperPizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;

public class NYFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String ordertype){
        Pizza pizza=null;

        if(ordertype.equals("cheese")){
            pizza=new NYCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza=new NYPepperPizza();
        }
        return pizza;
    }
}
