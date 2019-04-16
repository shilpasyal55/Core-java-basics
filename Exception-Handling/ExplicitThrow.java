//Explicit throw if you want different exception message
//java doesnot understand exceptions related to bussiness logic

class ExplicitThrow {
	public static void main(String[] args) {
		int balance = 2000;
		int withdrawlAmount = 3000;
		try {
			if (balance < withdrawlAmount) {
				throw new ArithmeticException("Insufficient Balance"); //throw exception
			}
			balance = balance - withdrawlAmount;
			System.out.println("Transaction done successfullt");	
		}
		catch (ArithmeticException e) {
			System.out.println("Exception " + e.getMessage());
		}

		System.out.println("continues");

	}
}