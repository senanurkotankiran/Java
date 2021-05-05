package Entities;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String email;
	private String username;
	private String password;
	private String dateOfBirthday;
	
	public Gamer(){
		
	}
	
	public Gamer(int id, String firstName, String lastName, String nationalityId, String email, String username,
			String password, String dateOfBirthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.email = email;
		this.username = username;
		this.password = password;
		this.dateOfBirthday = dateOfBirthday;
	}

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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(String dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	
}
