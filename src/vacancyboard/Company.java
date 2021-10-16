package vacancyboard;

public class Company {
	String name;
	Address address;
	String email;
	public Company(String name, Address address, String email) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
