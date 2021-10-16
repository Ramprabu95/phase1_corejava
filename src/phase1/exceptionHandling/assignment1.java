package phase1.exceptionHandling;
import java.util.Scanner;


public class assignment1 {
	
	public static void main(String[] args) throws CustomException
	{
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the salary");
			int salary = scanner.nextInt();
			validate(salary);
		}
	}
	
	static void validate (int salary) throws CustomException{
		if(salary<2100)
			throw new CustomException("you need to work hard");
		else if(salary > 2100 && salary < 5000)
			throw new CustomException("your salary is somehow good");
		else
			throw new CustomException("your salary is good");
		
	}
	 
	


}
class CustomException extends Exception{
	CustomException(String input)
	{
		super(input);
	}
}

