package calculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a First Number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter a Second Number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter a Operators are Like (+, -, *, /, % ) : ");
		char operator = scanner.next().charAt(0);
		int result=0;
		
		switch(operator) {
		case '+': result = num1 +num2;
		break;
		case '-': result = num1 -num2;
		break;
		case '*': result = num1 *num2;
		break;
		case '/': result = num1 /num2;
		break;
		case '%': result = num1 +num2;
		break;
		default:
			System.out.println("Wrong Operation");
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
		

	}

}
