package Keywords;



//Static key is used to declare variables/methods of the class itself we can access static variables/methods without creating objects of the class by 
//using classname.variable/methods they are also called class variables/methods
//static methods work on static method only


class Man{
	static String name = "Kausher ";
	static int age = 24;
	static void details () {
		System.out.println("Name = " + name + "Age = " +" " + age);
	}
	
}


public class StaticKey {
	public static void main(String[] args) {
		System.out.println(Man.name);
		System.out.println(Man.age);
		Man.details();
		
	}
}
