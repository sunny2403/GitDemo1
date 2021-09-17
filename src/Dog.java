abstract class Tiger{  //abstract class
	abstract void big();   //abstract method
	void display() {   //concrete method
		System.out.println("Tiger class");
	}
}

class Dog extends Tiger{    //Inheritance
	void big() {   //method overriding
		System.out.println("Lion class");
	}
public static void main(String args[]) {  //main method
	Dog d = new Dog();
	d.big();
}
}