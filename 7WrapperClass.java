//Converting Primitive to Wrapper Object
// parseInt(String) returns a primitive int, 
// whereas valueOf(String) returns a new Integer() object.
class PrimitiveToWrapper {

	convertToWrapper() {
		//Converting int primitive into Integer object
		//valueOf returns the Integer Object  
		int num=100;  
		Integer obj = Integer.valueOf(num);  //valueof is a static method

		System.out.println(num + " "+ obj);  
	}

	convertWrapperToPrimitive(){
		//Creating Wrapper class object 
		Integer obj = new Integer(100);  	
		//Converting the wrapper object to primitive
		int num = obj.intValue();
		System.out.println(num+ " "+ obj);
	}

	convertStringToInteger() {
		//parseInt return the primitive int
		String number = "10";
	    int result = Integer.parseInt(number);			
	    System.out.println(result);
	}
	
}