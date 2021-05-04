package Entities;

public class Gamer implements Entity {
 
	private int id;
	private String firstName;
	private String lastName;
	private String İdentityNumber;
	private String birthOfYear;
	public Gamer(int id, String firstName, String lastName, String identityNumber, String birthOfYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		İdentityNumber = identityNumber;
		this.birthOfYear = birthOfYear;
	}
	
	public Gamer() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getİdentityNumber() {
		return İdentityNumber;
	}

	public void setİdentityNumber(String identityNumber) {
		İdentityNumber = identityNumber;
	}

	public String getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(String birthOfYear) {
		this.birthOfYear = birthOfYear;
	};
	
	
	
	
	
	
	
	
}
