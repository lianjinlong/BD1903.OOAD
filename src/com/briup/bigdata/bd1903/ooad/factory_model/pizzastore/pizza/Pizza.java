package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza;

public abstract class Pizza{
    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+" baking;");
    }

    public void cut(){
        System.out.println(name+" cutting;");
    }

    public void box(){
        System.out.println(name+" boxing;");
    }

    public void setname(String name){
        this.name=name;
    }
}
