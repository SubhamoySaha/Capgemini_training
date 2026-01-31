package Tree_Set;
import java.util.*;
public class Movie {

	int id;
	String name;
	double rating;
	
	Movie(int id,String name,double rating) {
		this.id=id;
		this.name=name;
		this.rating=rating;
			}
	
	public String toString() {
		return "\n"+this.id+","+this.name+","+this.rating;
	}
}
