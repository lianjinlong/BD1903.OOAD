package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.absfactory;

import com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza.Pizza;

public interface AbsFactory{
    public Pizza CreatePizza(String ordertype);
}
