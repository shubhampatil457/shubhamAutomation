package overloadingpack;

public class Demo2 {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		String animal = d.animal;
		d.z=10;
		
		
		System.out.println(animal);
		System.out.println(d.z);
	d.sleep();
		
		
		
	}
		

}
