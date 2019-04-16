//Two types of Exception :
//Checked Exception (compile time exceptions)
//Unchecked Exception (runtime exceptions)
//There can be only one finally block

class InfoExceptionHandling {

	public static void main(String[] args) {

		try {
			System.out.println(3/0);
			System.out.println("In try Block");     //will not run as exception will occur in above line
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic Exception Message " + e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception Message " + e.getMessage());
		}
		finally {
			System.out.println("This code will run everytime");
		}

		System.out.println("After Catch Block");
	}
}