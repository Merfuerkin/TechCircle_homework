package week3_HomeWork;

public class CalculateSalary {

	public static void main(String[] args) {
//		## Task4
//
//		```Write a program that can calculate the salary after tax based on the following requirements
//		                the tax rates are:
//		                        35% for salary of 130K or more
//		      			30% for salary of 100K to 130k (excluded)
//		      			25% for salary of 80K to 100K (excluded)
//		      			20% for salary less than 80K
//		                in addition, if the person is married, he/she will pay 5% less tax

		double salary = 140000;
		boolean married = true;
		int lessTax = 5;

		if (salary >= 130000) {
			double taxRate = 35;
			if (married) {
				double newTaxRate = taxRate - lessTax;
				double taxRateDecimal = newTaxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $ " + salaryAfterTax);
			} else {

				double taxRateDecimal = taxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $ " + salaryAfterTax);

			}
		}

		else if (salary >= 100000 && salary < 130000) {
			double taxRate = 30;
			if (married) {
				double newTaxRate = taxRate - lessTax;
				double taxRateDecimal = newTaxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $" + salaryAfterTax);

			} else {
				double taxRateDecimal = taxRate / 100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $ " + salaryAfterTax);

			}
		} else if (salary >= 80000 && salary < 100000) {
			double taxRate = 25;
			if (married) {
				double newTaxRate = taxRate - lessTax;
				double taxRateDecimal = newTaxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is :" + salaryAfterTax);

			} else {
				double taxRateDecimal = taxRate / 100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $ " + salaryAfterTax);

			}

		} else if (salary < 80000) {
			double taxRate = 20;
			if (married) {

				double newTaxRate = taxRate - lessTax;
				double taxRateDecimal = newTaxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is :" + salaryAfterTax);
			}else {
				double taxRateDecimal = taxRate/100;
				double tax = salary * taxRateDecimal;
				double salaryAfterTax = salary - tax;
				System.out.println("Salary after tax is : $ " + salaryAfterTax);

			}

		}

	}

}
