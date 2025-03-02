package arraydemo;

public class SingleDimention {

	public static void main(String[] args) {
		int[] ar = { 16, 10, 3, 8, 7, 5, 23, 67, 45, 4, 7, 9, 10, 11, 34, 56, 89, 35, 19, 8, 3, 9, 2 };

		int[] a = new int[3];
		a[0] = 1;
		a[1] = 4;
		a[2] = 6;
		

		/* i have made changes today for git
		 * System.out.println(ar[0]); System.out.println(ar[3]);
		 * System.out.println(ar[5]);
		 */
		/*
		 * int leng = ar.length; System.out.println(leng);
		 */

		/*for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			*/
			for (int e:ar) {
				System.out.println(e);
			}
		}
	}

