package association.aggregation;

public class Library {

	private String name;
	private String location;
	private String Address;
	private String pincode;
	private Book[] b;
	
	Library()
	{
		
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Book[] getB() {
		return b;
	}

	public void setB(Book[] b) {
		this.b = b;
	}

	
}
