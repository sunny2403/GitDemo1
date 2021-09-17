
class Sunny {
		Sunny(){
		System.out.println("Parent");
		}
		}
class Roysuper extends Sunny{
		Roysuper(){
		super();
		System.out.println("Child");
		}
		public static void main(String args[]){
		Roysuper t = new Roysuper();
		}
}
