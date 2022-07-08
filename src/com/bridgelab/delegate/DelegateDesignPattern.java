package com.bridgelab.delegate;

public class DelegateDesignPattern {

	public static void main(String[] args) {
		Hp hp = new Hp();
		Epson epson = new Epson();
		
		Printer printer = new Printer(hp);
		printer.print();

	}

}
