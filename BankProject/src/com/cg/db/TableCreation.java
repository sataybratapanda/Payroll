package com.cg.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","litindia");
			  Statement stmt=con.createStatement();
	   stmt.executeUpdate("create table Employee(Id int primary key,yearlyInvestmentUnder80c int,firstname varchar(20),lastname varchar(20),department varchar(30),designation varchar(30),pancardNo varchar(20),emailId varchar(30))");
		        System.out.println("Employee Table Created");
		     
		       
		        stmt.executeUpdate("create table BankDetails(AccountNumber int primary key,BankName varchar(50),IFSC varchar(20))");
		        System.out.println("BankDetails Table Created");
		     
		        stmt.executeUpdate("create table Salary(Basicsalary int,hra int,conveyenceAllowance int,otherAllowance int,personalAllowance int,monthlyTax int,epf int,companyPf int,netSalary int)");
		        System.out.println("Salary Table Created");
		     
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
