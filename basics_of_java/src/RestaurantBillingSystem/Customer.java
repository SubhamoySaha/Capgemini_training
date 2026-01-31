package RestaurantBillingSystem;
import java.util.*;

public abstract class Customer implements BillPayable {
	
	private int customerId;
	private String name;
	HashMap<Integer, Order> orderhistory=new HashMap<Integer, Order>();
	
	Customer(int customerId,String name,int item_id){
		Order order=new Order();
		orderhistory.put(item_id,order);
		
		
	}
	
	
	

}
 