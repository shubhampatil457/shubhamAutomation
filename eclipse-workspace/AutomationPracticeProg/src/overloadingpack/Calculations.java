package overloadingpack;

public class Calculations {
	
	int z=10;
	String animal="dog";
	
	public void add() {
		System.out.println("print");
	}

	
	public void add(int a) {
		System.out.println("print "+a);
		
	}
	
	public void add(int a,int b) {
		System.out.println("print " +(a+b));
	}
	
	public static void sleep() {
		System.out.println("please let me sleep");
	}
	
}
