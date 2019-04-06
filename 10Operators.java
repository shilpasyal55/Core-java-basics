class UnaryOperator {
    void executeUnary() {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
        boolean condition = true; 
        // pre-increment operator 
        // a = a+1 and then c = a; 
        c = ++a; 
        System.out.println("Value of c (++a) = " + c); 
  
        // post increment operator 
        // c=b then b=b+1 
        c = b++; 
        System.out.println("Value of c (b++) = " + c); 
  
        // pre-decrement operator 
        // d=d-1 then c=d 
        c = --d; 
        System.out.println("Value of c (--d) = " + c); 
  
        // post-decrement operator 
        // c=e then e=e-1 
        c = e--; 
        System.out.println("Value of c (--e) = " + c); 
  
        // Logical not operator 
        System.out.println("Value of !condition =" + !condition); 

    }
}

class LogicalOperator {
    int num = 20;
    int num1 = 10;
    void andOROperator() {
        if(num > 5 && num < 30) { //And operator return true ,if both condition satisfy
            System.out.println("Good");
        }
        if(num > 5 || num > 30) {
            System.out.println("Nice"); //OR operator return true, if at least one condition is true.
        }
    }
}



public class Operators  
{ 
    public static void main(String[] args)  
    { 
          UnaryOperator obj = new UnaryOperator();
          obj.executeUnary();
    } 
} 