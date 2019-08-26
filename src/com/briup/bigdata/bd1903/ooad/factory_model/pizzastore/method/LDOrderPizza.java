package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.method;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.LDCheesePizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.LDPepperPizza;
import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String ordertype){
        Pizza pizza=null;

        if(ordertype.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(ordertype.equals("pepper")){
            pizza=new LDPepperPizza();
        }
        return pizza;
    }
}
