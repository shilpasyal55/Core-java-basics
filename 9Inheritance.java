class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public String sound(String talk) {
		return this.name + " sounds " + talk;
	}
    public String getName(){
        return this.name;
    }
}

class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
    // @Override
    // public String getName(){ //overwriting the getName() method in Animal
    //     return this.name;
    // } 
    public String catSound(String sound) {
        return super.sound(sound);
    }
}

public class Inheritance {
	public static void main(String[] args) {
		Cat obj = new Cat("cattyyyy");
        // System.out.println(obj.sound("meoww"));
        System.out.println(obj.catSound("meoww"));
        System.out.println(obj.getName());
	}
}