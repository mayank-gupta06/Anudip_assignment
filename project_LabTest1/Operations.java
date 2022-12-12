package project_LabTest1;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char operator;
 float number1,number2, result;
 
 Scanner input=new Scanner(System.in);
 System.out.println("Choose an operator: +,-,*,/,%");
 operator= input.next().charAt(0);
 
 System.out.println("Enter first number");
 number1=input.nextFloat();
 
 System.out.println("Enter second number");
 number2=input.nextFloat();
 
 switch (operator) {

case '+':
   result = number1 + number2;
   System.out.println(number1 + " + " + number2 + " = " + result);
   break;

 case '-':
   result = number1 - number2;
   System.out.println(number1 + " - " + number2 + " = " + result);
   break;

 case '*':
   result = number1 * number2;
   System.out.println(number1 + " * " + number2 + " = " + result);
   break;

 
 case '/':
   result = number1 / number2;
   System.out.println(number1 + " / " + number2 + " = " + result);
   break;

 case '%':
	   result = (float)((number1 / number2)*100);
	   System.out.println("result::"+ result);
	   break;
	   
 default:
   System.out.println("Invalid operator!");
   break;
}

input.close();
	
	}

}
