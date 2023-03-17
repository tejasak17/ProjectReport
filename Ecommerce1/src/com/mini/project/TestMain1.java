package com.mini.project;

import java.sql.SQLException;
import java.util.Scanner;

public class TestMain1 {

 private static int Id;

public static void main(String[] args) throws SQLException {
		
		Registration1 registration = new Registration1();
		registration.getRegistration();
		MainProduct1 mainProduct = new MainProduct1();
		mainProduct.getMainProduct();
		
		registration.selectProduct();
		registration.insertData();
		Admin  admin=new Admin();
		admin.displayTable();

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter userId for Fetching user data");
    	int	id=scanner.nextInt();
	    admin.fetchData(id);
		// registration.getRegisteredList();
	
		// Cart  cart=new Cart();
		// cart.addCart();
  }
}
