package DataTypes;

class School {
	private int id;
	private String name;
	private String location;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}

public class NoPrimaryData {
	public static void main(String[] args) {
		
		School[] schools = new School[6];
		for (int i = 0; i < schools.length; i++) {
			schools[i] = new School();
			schools[i].setId(i + 1); 
			schools[i].setLocation("Sector " + (i + 1));
			schools[i].setName("School " + (i + 1));
		}
		for (School school : schools) {
			System.out.println(school.toString());
		}

	}
}
