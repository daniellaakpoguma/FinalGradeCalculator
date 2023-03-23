
public class GradeCalculator {
 
	public double gradeCaclculator(double grade, double percentage){
		double finalGrade = 0;
		double value = (grade* percentage/100);
		finalGrade = finalGrade + value;
		return finalGrade; 
		
	}
}
