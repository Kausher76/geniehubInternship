package MyNewPackage;

public class ThrowsKeyword {
	
	static void LoadDriver() throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}

	public static void main(String[] args) {
		try {
			LoadDriver();
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
