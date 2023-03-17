package com.mini.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration1 {

	String user_name;
	String pass_word;
	String product_1;
	String product_2;
	String product_3;
	String product_4;
	String product_5;
	int total_amount;

	public void getRegistration() {
		System.out.println("Welcome to Online Shoping");
		System.out.println("Register Youself ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your User_Name");
		user_name = scanner.nextLine();
		System.out.println("Please Enter Password");
		pass_word = scanner.nextLine();
		System.out.println("User Register Successfully");
	}
	public void selectProduct() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please select product to insert into cart");
		System.out.println("Select product 1");
		product_1=scanner.nextLine();
		System.out.println("Select product 2");
		product_2=scanner.nextLine();
		System.out.println("Select product 3");
		product_3=scanner.nextLine();
		System.out.println("Select product 4");
		product_4=scanner.nextLine();
		System.out.println("Select product 5");
		product_5=scanner.nextLine();
		System.out.println("");
		System.out.println("Successfully Added to Cart");
	}
	public void insertData() {
		ConnectionTest1  connectionTest1=new ConnectionTest1();
	try {
		Connection  connection=connectionTest1.getConnection();
	PreparedStatement ps1=connection.prepareStatement("insert into userdata( user_name, pass_word, product_1, product_2, product_3, product_4, product_5, total_amount)values(?,?,?,?,?,?,?,?)");
	ps1.setString(1,user_name);
	ps1.setString(2,pass_word);
	ps1.setString(3, product_1);
	ps1.setString(4, product_2);
	ps1.setString(5, product_3);
	ps1.setString(6, product_4);
	ps1.setString(7, product_5);
	ps1.setInt(8, total_amount);
	ps1.execute();
	System.out.println("Successfully data inserted");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}	
	}
}