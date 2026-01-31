package association.aggregation.Netflix;

public class Subscription {

	private double Amount;
	private String end_date;
	private int num_of_devices;
	
	public String getdetails()
	{
		return "Amount: "+Amount+"\nEnd Date: "+end_date+
				"\nNumber of Devices: "+num_of_devices;
	}
}
