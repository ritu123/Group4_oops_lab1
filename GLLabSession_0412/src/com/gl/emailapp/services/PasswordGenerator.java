//package com.gl.emailapp.services;
//
//import java.util.Random;
//
//public class PasswordGenerator {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String charSetUp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String charSetLower = "abcdefghijklmnopqrstuvwxyz";
//		String numSet       = "1234567890";
//		String symbols      = "!@#$%^&*()";
//		String PassChar     = charSetUp+charSetLower+numSet+symbols;
//		char[] password = new char[8];
//		Random randomNum  = new Random();
//		
//		for(int i=0; i<password.length; i++) {
//			
//			password[i] = PassChar.charAt(randomNum.nextInt(PassChar.length()));
//			
//		}
//		
//		System.out.println(password);
//		 
//		 
//
//	}
//
//}
