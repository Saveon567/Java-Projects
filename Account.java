package io.github.vikeshpandey.corejava.project.atm;

import java.text.DecimalFormat;

import com.sun.java_cup.internal.runtime.Scanner;

public class Account {
	
	private int customNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat(" '$' ###, ##0.00");
	private int customerNumber;
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	
	public int getCustomerNumber() {

}
	}
