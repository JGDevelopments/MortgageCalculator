import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		final byte MONTHS_IN_YEAR = 12; 
		final byte PERCENT = 100;
		
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("Principal: " );
		int princAmount = scanner.nextInt();
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Annual Interest Rate: ");
		float annualInt = scanner2.nextFloat();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.print("Period (Years): ");
		int timeInYears = scanner3.nextInt(); 
		
		int numberOfPayments = timeInYears * MONTHS_IN_YEAR; 
		float monthlyInterest = annualInt / PERCENT / MONTHS_IN_YEAR;
		double mortgage = princAmount
					* (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
					/ (Math.pow(1 + monthlyInterest, numberOfPayments) -1 );

		
		System.out.println("Mortgage: $" + Math.round(mortgage));
		
	}

}
