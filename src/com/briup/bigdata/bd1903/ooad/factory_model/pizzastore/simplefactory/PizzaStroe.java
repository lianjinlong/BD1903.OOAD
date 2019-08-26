package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.simplefactory;

public class PizzaStroe{
    public static void main(String[] args){
        SimplePizzaFactory mSimplePizzaFactory;
        OrderPizza mOrderPizza;
        mOrderPizza=new OrderPizza(new SimplePizzaFactory());
    }
}
