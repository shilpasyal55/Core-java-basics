//“this” keyword can be used inside the constructor to call another
// overloaded constructor in the same Class. It is called the Explicit Constructor Invocation. 
//this reference cannot be used in a static context, as static code is not executed
// in the context of any object
class ThisKeywordInConstructor {
	ThisKeywordInConstructor() {
		//call to this must be first statement in constructor
		this("Working Fine");      //will call constructor with one string argument
		System.out.println("Constructor without parameter");
	}	

	ThisKeywordInConstructor(String str) {
		System.out.println("Constructor with parameter");
	}
}

// using 'this' keyword to refer current class instance variables 
class ThisInstanceVariable {
	int a; 
    int b; 
      
    // Parameterized constructor 
    ThisInstanceVariable(int a, int b) 
    { 
        this.a = a;   //this.a refers to instance variables
        this.b = b; 
    } 
  
    void display() 
    { 
        //Displaying value of variables a and b 
        System.out.println("a = " + a + "  b = " + b); 
    }  
}


//using 'this' keyword to return the current class instance

class ThisCurrentClass 
{ 
	int a,b; 

	//Default constructor 
	ThisCurrentClass() 
	{ 
		a = 10; 
		b = 20; 
	} 
	
	//Method that returns current class instance 
	ThisCurrentClass get() 
	{ 
		return this; 
	} 
	
	//Displaying value of variables a and b 
	void display() 
	{ 
		System.out.println("a = " + a + " b = " + b); 
	} 

} 


public class ThisKeyword {
	public static void main(String[] args) {
		ThisKeywordInConstructor obj = new ThisKeywordInConstructor();
		ThisInstanceVariable obj1 = new ThisInstanceVariable(20,30);
		obj1.display();
		ThisCurrentClass object = new ThisCurrentClass(); 
		object.get().display();   //Method Chaining
	}
}