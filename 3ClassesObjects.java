//classes and Objects 

class Box{
	 int length,breadth,height;

	 public void setDimensions(int l,int b,int h) {
	 	length = l;
	 	breadth = b;
	 	height = h;
	 }

	 public void showDimensions() {
	 	System.out.println("length " + length);
	 	System.out.println("breadth " + breadth);
	 	System.out.println("height " + height);
	 }	 
}

public class ClassesObjects {
	public static void main(String[] args) {
	 	Box smallbox = new Box();  //smallbox is a reference variable
		smallbox.setDimensions(21,23,12);
		smallbox.showDimensions();
	 }
}


