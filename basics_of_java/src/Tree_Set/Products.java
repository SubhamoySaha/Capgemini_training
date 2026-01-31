package Tree_Set;

public class Products implements Comparable<Products> {
	int id;
	String name;
	double price;
	
	public Products(int id, String name, double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	@Override
	public int compareTo(Products p) {
		if(this.id<p.id) {
			return -1;
		}
		if(this.id>p.id) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "\n"+this.id+","+this.name+","+this.price;
	}
	
}
