package com.cg.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import com.cg.dto.BankDetails;
import com.cg.dto.Employee;
import com.cg.dto.Salary;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		try {
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Satya@123");

	BankDetails bkdetails=new BankDetails(24890124,"EFSKFKDFK","IDFC");
	Salary sal=new Salary(20000,2400,300); 
	Employee emp=new Employee(bkdetails,sal,303,5001,"James","Gostling","FS","Consultant","ENGLSOP","semi@gmail.com");
	
	
	   PreparedStatement stmt=con.prepareStatement("insert into BankDetails values(?,?,?)");
	 stmt.setLong(1, bkdetails.getAccountNumber());
     stmt.setString(2,bkdetails.getIfscCode());
     stmt.setString(3,bkdetails.getBankName());
     stmt.executeUpdate();
     System.out.println("Bank Details Inserted");
     
  

	 PreparedStatement stmt1=con.prepareStatement("insert into Salary values(?,?,?,?,?,?,?,?,?)");
	    stmt1.setInt(1,sal.getBasicSalary());
	    stmt1.setInt(2,sal.getHra());
	    stmt1.setInt(3,sal.getConveyenceAllowance());
	    stmt1.setInt(4,sal.getOtherAllowance());
	    stmt1.setInt(5,sal.getPersonalAllowance());
	    stmt1.setInt(6,sal.getMonthlyTax());
	    stmt1.setInt(7,sal.getEpf());
	    stmt1.setInt(8,sal.getCompanyPf());
	    stmt1.setInt(9,sal.getNetSalary());
	    stmt1.executeUpdate();
	    System.out.println("Salary Details Inserted ");
	  
	
	

	 PreparedStatement stmt2=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?)");
	 stmt2.setInt(1, emp.getId());
	 stmt2.setInt(2,emp.getYearlyInvestmentUnder80c());
	 stmt2.setString(3, emp.getFirstName());
	 stmt2.setString(4, emp.getLastName());
	 stmt2.setString(5, emp.getDepartment());
	 stmt2.setString(6,emp.getDesignation() );
	 stmt2.setString(7, emp.getPanCard());
	    stmt2.setString(8, emp.getEmailId());
	    stmt2.executeUpdate();
	      System.out.println("Employee Data is Inserted");
		}	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 /*
	System.out.println("FirstName:"+emp.getFirstName()+" "+"LastName:"+emp.getLastName()+" "+"Designation:"+emp.getDesignation()+" "+""
			+ "AcNo: "+emp.getBankDetails().getAccountNumber()+" "+sal.getHra()+" "+sal.getEpf()+" "+sal.getCompanyPf()+" "+sal.getOtherAllowance());
	
	*/
	
	}

}
