abstract class Elephant{  //abstract class
	abstract void sound();   //abstract method
	void display() {   //concrete method
		System.out.println("I'm from Animal class");
	}

Elephant(){
	System.out.println("Makes sound");
}
}
class Abscons extends Elephant{    //Inheritance
	void sound() {   //method overriding
		System.out.println("Barking");
	}
public static void main(String args[]) {  //main method
	Abscons d = new Abscons();
	d.sound();
}
}