package week3_HomeWork;

 
 

public class Task1_SalaryCalculator {

	public static void main(String[] args) {
		 
		int hourlyRate =50;
		int weeklyHours=45;
		double stateTaxRate=6 ;
		double federalTaxRate=26;
		 
		
		int salaryBeforeTax = hourlyRate*weeklyHours*52;
		double stateTaxDecimal=stateTaxRate/100;
		double federalTaxDecimal=federalTaxRate/100;
		
		double federalTax=federalTaxDecimal*salaryBeforeTax;
		double stateTax= stateTaxDecimal*salaryBeforeTax;
		double totalTax= stateTax+federalTax;
		double NetIncome=salaryBeforeTax-totalTax;
		
		System.out.println("Gross pay is $ "+ salaryBeforeTax);
		System.out.println("Federal tax is: $"+ federalTax);
		System.out.println("State tax is: $"+stateTax);
		System.out.println("Total tax is: $" + totalTax);
		System.out.println("Net income is: $ " +NetIncome );
		
		
		
		
		
		
		
		
	}

}


