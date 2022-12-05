package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.services.CredentialService;
import com.gl.emailapp.services.CredentialServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your First Name : ");

		String firstName = sc.next();

		System.out.println("Please Enter your Last Name : ");

		String lastName = sc.next();

		Employee emp = new Employee(firstName, lastName);

		System.out.println("Please Enter the Department from the following ");
		System.out.println("1. Press 1 for Technical");
		System.out.println("2. Press 2 for Admin");
		System.out.println("3. Press 3 for Human Resource");
		System.out.println("4. Press 4 for Legal");
		System.out.println("-----------------------------------------------");
		System.out.println("Enter Your Choice");

		int departmentID = sc.nextInt();
		String department = null;

		switch (departmentID) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
		default:
			System.out.println("Please enter the correct Choice");
			break;

		}

		CredentialService service = new CredentialServiceImpl();

		service.emailGenerator(emp, department);
		service.passwordGeneator();
		service.displayCredentails(emp, department);

	}

}
