package tylerpotts_SemesterProject;

public class User {

	private String firstName;
	private String lastName;
	private String state;
	private int birthYear = 1900;
	private int creditScore = 300;
	
	// construct a default User
	
	public User() {
	firstName = "Gabe";
	lastName = "Last";
	state = "Indiana";
	}
	
	// User with specified info
	public User(String firstName, String lastName, String state, int birthYear, int creditScore ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
		this.birthYear = birthYear;
		this.creditScore = creditScore;
	
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(Integer creditScore) {
		this.creditScore = creditScore;
	}

	
	// Print user info
	
	public String toString() {
		return "Your personal info: " + firstName +" " + lastName ;
		
	}
	
	
	
}
