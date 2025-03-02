package arraydemo;

public class TwoDimentionArray3 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,4},{2,0,8,7},{3,5,6,7},{2,7,46,45},{1,8,23,89,77}};
		
		
		/*
		 * for(int i=0;i<ar.length;i++) { for(int j=0;j<ar[i].length;j++) {
		 * System.out.print(ar[i][j]+" "); } System.out.println(); }
		 */
		
		
		for(int[] b:ar) {
			for(int c:b) {
				System.out.println(c);
			}
		}

	}

}
