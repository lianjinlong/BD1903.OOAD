package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("CheesePizza");

		System.out.println(name+" preparing;");
	}

}
