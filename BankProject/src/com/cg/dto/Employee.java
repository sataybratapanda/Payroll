
package com.cg.dto;
public  class Employee 
{
	
	private static int  COUNTER;
	private BankDetails bankDetails;
	private Salary salary;
	
	

	public Employee(BankDetails bankDetails, Salary salary, int id,
			int yearlyInvestmentUnder80c, String firstName, String lastName,
			String department, String designation, String panCard,
			String emailId) {
		super();
		this.bankDetails = bankDetails;
		this.salary = salary;
		this.id = id;
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80c;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public static int getCOUNTER() {
		
		return COUNTER;
	}
	int count;
	private int id;
	private int yearlyInvestmentUnder80c;
	private String firstName,lastName, department,designation, panCard,emailId;
	

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee(int id, int yearlyInvestmentUnder80c, String firstName,String lastName,String department, String designation,
			String panCard, String emailId) 
	{
		this(id,firstName,lastName);
			
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80c;
		this.department = department;
		this.designation = designation;
		this.panCard = panCard;
		this.emailId = emailId;
		count++;
		COUNTER++;
	}
	public void displayEmployee()
	{
		System.out.println(getId()+" "+getYearlyInvestmentUnder80c()+" "+getFirstName()+" "+getLastName()+" "+getDepartment()+" "+getDesignation()+" "+getPanCard()+" "+getEmailId());

	}
	
	public int getId() {
		//getCOUNTER();
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYearlyInvestmentUnder80c() {
		return yearlyInvestmentUnder80c;
	}
	public void setYearlyInvestmentUnder80c(int yearlyInvestmentUnder80c) {
		this.yearlyInvestmentUnder80c = yearlyInvestmentUnder80c;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Employee() {
	//System.out.println("No argument constructor");
		// TODO Auto-generated constructor stub
	count++;
	COUNTER++;
	}
	/*{
		System.out.println("This is the initialiser");
	}
	*/
	
	

}
