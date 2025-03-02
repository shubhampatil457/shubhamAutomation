package flowcontrolpack;

public class Ifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int a = 6, b = 5, c = 4, d = 3;

		if (a < b) {

			System.out.println("a is greater than b");
		} else if (b < c) {

			System.out.println("b is greater than c");

		}

		else if (c < d) {
			System.out.println("c is greater than d");

		} else {
			System.out.println("d is  less than a");
		}
	}
}
