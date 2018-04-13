package com.infotech.client;

public class ThrowDemo {

	public static void main(String[] args) {
		ThrowDemo throwDemo = new ThrowDemo();
		try {
			throwDemo.display();
		} catch (RuntimeException ex) {
			System.out.println("Exception caught in catch block of main");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	private void display() {
		try {
			throw new RuntimeException("Runtime exception occured..");
		} catch (RuntimeException ex) {
			System.out.println("Exception caught in catch block of display");
			throw ex;
		}
	}

}