import java.util.Scanner;

public class converter {
	
	public void getDigits(int num){
				
		int numThousands = num / 1000;
		int numHundreds = (num % 1000) / 100;
		int numTens = (num % 100) / 10;
		int numOnes = (num % 10);
		
		// print the thousands place
		if (numThousands > 0 && numThousands < 5)
		{
			for (int i = 0; i < numThousands; i++)
				System.out.print("M");		
		}		
		
		// print the hundreds place
		if (numHundreds == 9)
			System.out.print("CM");
		
		if (numHundreds > 4 && numHundreds < 9)
		{
			System.out.print("D");
			for (int i = 5; i < numHundreds; i++)
				System.out.print("C");		
		}	
		
		if (numHundreds == 4)
			System.out.print("CD");
		
		if (numHundreds < 4)
		{
			for (int i = 0; i < numHundreds; i++)
				System.out.print("C");	 
		}
			
			
		// print the tens place
		if (numTens == 9)
			System.out.print("XC");
		
		if (numTens > 4 && numTens < 9)
		{
			System.out.print("L");
			for (int i = 5; i < numTens; i++)
				System.out.print("X");		
		}	
		
		if (numTens == 4)
			System.out.print("XL");
		
		if (numTens < 4)
		{
			for (int i = 0; i < numTens; i++)
				System.out.print("X");	 
		}
			
		// print the ones place
		if (numOnes == 9)
			System.out.print("IX");
		
		if (numOnes > 4 && numOnes < 9)
		{
			System.out.print("V");
			for (int i = 5; i < numOnes; i++)
				System.out.print("I");		
		}	
		
		if (numOnes == 4)
			System.out.print("IV");
		
		if (numOnes < 4)
		{
			for (int i = 0; i < numOnes; i++)
				System.out.print("I");	 
		}
					

	}

	public static void main(String[] args) {
		
		int number;
		
		do{
			System.out.println("Please provide a number for Roman Numeral conversion between 1 and 4,999: ");
			Scanner input = new Scanner(System.in);
			
			number = input.nextInt();
		}
		while (number < 1 || number > 4999);

		converter o = new converter();
		o.getDigits(number);
		
		
		
	}

}
