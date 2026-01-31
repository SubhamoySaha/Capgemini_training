package stringbuilder;

public class AdjacentDuplicateRemove {

	public static void main(String[] args) {
		String s="abbacddf";
		StringBuilder sb=new StringBuilder(s);
		int a=0,b=0,l=sb.length();
		while()
		{
			for(int i=a+1;i<l-1;i++)
		
		{
			if(sb.charAt(a)==sb.charAt(i))
			{
				b++;
			}
			else {
				a++;
				b++;
			}
		}
		if(b>a)
		{
			sb.delete(a, b+1);
			l=sb.length();
			a=0;
			b=0;
		}
	}
}
}
