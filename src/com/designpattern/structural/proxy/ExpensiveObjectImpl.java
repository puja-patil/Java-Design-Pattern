package com.designpattern.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

	public ExpensiveObjectImpl() {
		heavyInitialConfiguration();
	}

	@Override
	public void process() {
//		LOG.info("processing complete");
		System.out.println("processing complete");
	}

	private void heavyInitialConfiguration() {
//		LOG.info("Loading initial configuration");
		System.out.println("Loading initial configuration");
	}

}
