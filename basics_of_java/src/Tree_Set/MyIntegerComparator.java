package Tree_Set;
import java.util.*;

public class MyIntegerComparator implements Comparator<Integer> {
	
	public int compare(Integer i1,Integer i2) {
		if(i1>i2) {
			return -1;
		}
		
		if(i1<i2) {
			return 1;
		}
		return 0;
	}
}
