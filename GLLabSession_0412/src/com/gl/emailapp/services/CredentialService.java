package com.gl.emailapp.services;

import com.gl.emailapp.model.Employee;

public interface CredentialService {
	public String passwordGeneator();
	
	public String emailGenerator(Employee employee, String department);
	
	public void displayCredentails(Employee emp, String department);
	

}
