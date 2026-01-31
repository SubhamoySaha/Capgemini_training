package Tree_Set;
import java.util.*;
public class MovieCalling {
	
	

	public static void main(String[] args) {
	TreeSet<Movie> ts=new TreeSet<Movie>(new Audience());
	ts.add(new Movie(1,"A",4.2));
	ts.add(new Movie(2,"b",3.8));
	ts.add(new Movie(3,"c",4));
	
	System.out.println(ts);
	
}
}
