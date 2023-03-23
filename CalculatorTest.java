import java.util.Scanner;

/**
 * @author Oghenerukevwe
 *
 */
public class CalculatorTest {
	
	public static void main(String[]args) {
		System.out.println("Welcome to the Final Grade Calculator");
		String shouldContinue;
		double finalGrade = 0;
		
	do { 
		System.out.print("Input your grade:");
		
		Scanner keyboard = new Scanner (System.in);
		double value1 = keyboard.nextDouble();
		
		System.out.print("Input its weighted mark:");
		double value2 = keyboard.nextDouble();
		
		GradeCalculator calculator = new GradeCalculator();
		finalGrade = calculator.gradeCaclculator(value1, value2);
		
		System.out.print("Input another grade?(Y/N)");
		shouldContinue = keyboard.next();
		
	     } while (shouldContinue.equalsIgnoreCase("Y"));
		
		System.out.println("Your final grade is: "+ finalGrade);
	
	}
}
