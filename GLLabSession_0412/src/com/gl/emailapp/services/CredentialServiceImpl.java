package com.gl.emailapp.services;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String passwordGeneator() {
		// TODO Auto-generated method stub

		String charSetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String charSetLower = "abcdefghijklmnopqrstuvwxyz";
		String numSet = "1234567890";
		String symbols = "!@#$%^&*()";
		String PassChar = charSetUp + charSetLower + numSet + symbols;
		char[] password = new char[8];
		Random randomNum = new Random();

		for (int i = 0; i < password.length; i++) {

			password[i] = PassChar.charAt(randomNum.nextInt(PassChar.length()));

		}

		return new String(password);
	}

	@Override
	public String emailGenerator(Employee employee, String department) {
		// TODO Auto-generated method stub

		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();

		String email = (firstName + lastName).toLowerCase() + "@" + department + ".company.com";

		return email;
	}

	@Override
	public void displayCredentails(Employee emp, String department) {
		// TODO Auto-generated method stub
		System.out.println(
				"Dear " + emp.getFirstName() + " " + emp.getLastName() + " your generated credentails are as follows:");
		System.out.println("Email Address ------>  " + emailGenerator(emp, department));
		System.out.println("Password ------>  " + passwordGeneator());

	}

}
