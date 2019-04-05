class TypeConversion {
	public static void main(String args[]) {

		//Widening Conversion
		int a = 4;
		float b = a; //automatic conversion, No error
		System.out.println("a => " + a + ", b => " + b );

		//Narrowing Conversion
		float x = 3.4f; // use f suffix with float values
		//int y = x; //Narrowing Conversion,Will give Error

		int y = (int)x;  //Type casting float to int

		System.out.println("y " + y);

		// float z = 3.5;  //Narrowing Conversion, 3.5 is considered as Double
		//float z = 3.5 //no error

		//declaring constant variable with final keyword
		final int bonus = 20;
		bonus = 50; //Error

	}
}

//Type Casting in Java
//Type casting is used to convert an object or variable of one type into another.


//Syntax
//dataType variableName = (dataType) variableToConvert;

// There are two casting directions:
//  narrowing (larger to smaller type) and widening (smaller to larger type). 
//  Widening can be done automatically (for example, int to double), 
//  but narrowing must be done explicitly (like double to int).