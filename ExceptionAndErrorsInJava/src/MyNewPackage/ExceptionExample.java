package MyNewPackage;

public class ExceptionExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           
        } catch (Exception e) {
            System.out.println(e);
        }
		finally {
			System.out.println("Finally Block");
			
		}
		
	}
}
