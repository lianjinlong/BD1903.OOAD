package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("GreekPizza");

		System.out.println(name+" preparing;");
	}

}
