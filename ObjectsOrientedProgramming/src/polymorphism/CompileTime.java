package polymorphism;




public class CompileTime {
	
	public static int add(int x, int y) { 
		return (x + y);
	}
	
	public static int add(int x, int y, int z) { 
		return (x + y + z);
	}
	
	
	
	
	public static void main(String[] args) {
	    System.out.println(add(4, 6));
	    System.out.println(add(6, 6, 6));
		
		
	}

}
