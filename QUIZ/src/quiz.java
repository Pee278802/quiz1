import java.util.Scanner;

public class quiz {
	
	private static Scanner input;
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter height in feet (female): ");
	int female_feet = input.nextInt();
	
	System.out.print("Enter height in inch (female): ");
	int female_inch = input.nextInt();
	int remain_feet = ((female_feet -5) * 12);
	int total_inch = (remain_feet + female_inch);
	int remain_weight = (female_inch * 5);
	
	int female_weight = 40 + (5 * total_inch);
	System.out.println("The ideal weight for a female who is " + female_feet + "'" + female_inch + " would be = " + female_weight + "kg.");
	

	
	
		
	System.out.print("Enter height in feet (male): ");
	int male_feet = input.nextInt();
		
	System.out.print("Enter height in inch (male): ");
	int male_inch = input.nextInt();
	int male_remain_feet = ((male_feet -5) * 12);
	int total_male_inch = (male_remain_feet + male_inch);
	int male_remain_weight = (male_inch * 6);
		
	int male_weight = 50 + (6 * total_male_inch);
	System.out.println("The ideal weight for a male who is " + male_feet + "'" + male_inch + " would be " + "40 = " + male_weight + "kg.");
		
	}
}
	