//use throws in method defination to get rid of compile time error of checked exception

import java.io.*;

public class CheckedException {          //use throws here or use try catch
	public static void main(String[] args) {
		
		try {
			throw new IOException();
		}
		catch(IOException e) {
			System.out.println("Exception Raises " + e.getMessage());
		}
	}
}