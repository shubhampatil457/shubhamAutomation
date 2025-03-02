package filepack;

public class SystemDir {

	public static void main(String[] args) {
		String getproperty = System.getProperty("user.dir");
		System.out.println(getproperty);

		String getproperty2 = System.getProperty("os.name");
		System.out.println(getproperty2);

	}

}
