package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza;

public class PepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("PepperPizza");

		System.out.println(name+" preparing;");
	}

}
