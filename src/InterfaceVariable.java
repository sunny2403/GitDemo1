interface InterfaceDemo1 {   //1st interface
	int x = 15;
public abstract void m1();
}
interface InterfaceDemo2 extends InterfaceDemo1{    //2nd interface
	public abstract void m2();
}
class InterfaceVariable implements InterfaceDemo1{  //extending interface with implements keyword between class & interface
	public void m1() {
	System.out.println("Welcome");
	}
	public static void main (String args[]) {
		InterfaceVariable id = new InterfaceVariable();
		id.m1();
		System.out.println(x);
	}
	}
