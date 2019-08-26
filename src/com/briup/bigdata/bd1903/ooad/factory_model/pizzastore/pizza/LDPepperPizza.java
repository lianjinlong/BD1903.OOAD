package com.briup.bigdata.bd1903.ooad.factory_model.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setname("LDPepperPizza");

		System.out.println(name+" preparing;");
	}

}
