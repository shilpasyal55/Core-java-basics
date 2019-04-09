//If two or more string have same set of characters, then they share
//the same reference in memory

class StringExample {
	public static void main(String[] args) {

		//All the below string referenced str1,str2,str3 denote the same String object
		String str1 = "Nugen Services";
		String str2 = "Nugen Services";
		String str3 = "Nugen " + "Services";

		//new always create a different object,even if string reference has same values
		String str4 = new String("Nugen Services");

		//reference or address are checked
		System.out.println(str1 == str2); //true 

		//compares the string value
		System.out.println(str1.equals(str2)); // true

		//two different objects
		System.out.println(str1 == str4);  //false

		//string values are same
		System.out.println(str1.equals(str4)); //true
	}
}