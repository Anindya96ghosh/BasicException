package BasicException;

import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{

		Factorial facto=new Factorial();
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		try
		{
			int fact=facto.factorial(num);
			System.out.println("The factorial is "+fact);
		}
		catch (InvalidInputException iie) //Exception for input less than 2
		{
			iie.printStackTrace();
		}
		catch (FactorialException fe)	//Exception for factorial exceeding the int range	
		{
			fe.printStackTrace();
		}
		catch (Exception e) 		//Generalized Exception 
		{
			e.printStackTrace();
		}
		
	}
}
