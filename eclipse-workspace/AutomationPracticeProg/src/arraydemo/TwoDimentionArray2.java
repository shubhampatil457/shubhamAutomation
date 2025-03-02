package arraydemo;

public class TwoDimentionArray2 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,4},{2,0,8,7},{3,5,6,7},{2,7,46,45},{1,8,23,89,77}};
		
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println(ar[i][j]);
			}
		}

	}

}
