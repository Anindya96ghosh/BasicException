package BasicException;
//Defining the InvalidInputException class
class InvalidInputException extends Exception {
	public InvalidInputException(){
		super();
	}
}


//Defining the FactorialException class
class FactorialException extends Exception {
	public FactorialException(){
		super();
	}
}

public class Factorial {

	int factorial(int num)throws InvalidInputException, FactorialException{
		if(num <2)
		{
			throw new InvalidInputException();
		}
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		if(fact>2_147_483_647)
		{
			throw new FactorialException();
		}
		return (int)fact;

	}
	
}
