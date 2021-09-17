public class Thiskeyword {
	
		int x = 15;
		void display(){
		int x = 20;
		System.out.println(this.x);
		}
		public static void main (String args[]){
		Thiskeyword ku = new Thiskeyword();
		ku.display();
		}
		}

