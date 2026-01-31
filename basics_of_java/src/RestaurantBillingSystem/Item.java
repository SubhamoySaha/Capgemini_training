package RestaurantBillingSystem;

public class Item {

	private int itemId;
	private String itemName;
	private double price;
	private String role;
	
	Item(int itemId,String itemName,double Price,String role) throws InvalidPriceException{
		this.itemId=itemId;
		this.itemName=itemName;
		setPrice(price,role);
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price, String role) throws InvalidPriceException{
		
		if(!role.equalsIgnoreCase("ADMIN")) {
			throw new UnauthorizedAccessException("Only ADMIN can update the price.");
		}
		if(price<=0) {
			throw new InvalidPriceException("Price must be greater than 0.");
		}
		
		this.price=price;
	}
}
