package filepack;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File file = new File("ShubhamNew.img");
		System.out.println(file.createNewFile());
		
				

	}

}
