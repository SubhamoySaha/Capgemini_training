package association.aggregation.Netflix;

public class User {

	private String Name;
	private String Email;
	private String DOB;
	private Subscription subscription; 
	
	User(String Name, String Email, String DOB, String subscription_status){
		this.Name=Name;
		this.Email=Email;
		this.DOB=DOB;
		if(subscription_status=="Yes") {
			if(subscription==null)
			{
				subscription=new Subscription();
			}
			subscription.getdetails();
		}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
}
