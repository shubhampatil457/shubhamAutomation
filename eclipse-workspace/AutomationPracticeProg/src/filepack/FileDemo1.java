package filepack;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\shubh.txt");
		boolean filestatus1 = file1.exists();
		System.out.println(filestatus1);

	
	File file2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\shubh1.txt");
	boolean filestatus2 = file2.exists();
	System.out.println(filestatus2);
	
	File file3 = new File("Test.txt");
		System.out.println(file3.exists());

	}
	

}
