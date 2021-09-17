interface InterfaceDemo {
public abstract void m1();
}
class Myinterface implements InterfaceDemo{
	public void m1() {
	System.out.println("Welcome");
	}
	public static void main (String args[]) {
		Myinterface id = new Myinterface();
		id.m1();
	}
	}

