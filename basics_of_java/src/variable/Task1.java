package variable;

public class Task1 {
	
	public static void main(String[] args) {
		
		byte by=4;
		
		
		short s=40;
		int i=200;
		long l=30000000000l;
		float f=25.0f; //Always need to suffix with f
		double d=30.0;
		char c='A';
		
			 System.out.println("From byte to others\n======================\n");
			 short by1=by;
			 int by2=by;
			 long by3=by;
			 float by4=by;
			 double by5=by;
			 char by6=(char)by;
			 System.out.println("short= "+by1);
			 System.out.println("int= "+by2);
			 System.out.println("long= "+by3);
			 System.out.println("float= "+by4);
			 System.out.println("doouble= "+by5);
			 System.out.println("char= "+by6);
			 
			 System.out.println("From short to others\n======================\n");
			 byte s1=(byte)s;
			 int s2=s;
			 long s3=s;
			 float s4=s;
			 double s5=s;
			 char s6=(char)s;
			 System.out.println("byte= "+s1);
			 System.out.println("int= "+s2);
			 System.out.println("long= "+s3);
			 System.out.println("float= "+s4);
			 System.out.println("doouble= "+s5);
			 System.out.println("char= "+s6);		
			 
			 System.out.println("From int to others\n======================\n");
			 byte i1=(byte)i;
			 short i2=(short)i;
			 long i3=i;
			 float i4=i;
			 double i5=i;
			 char i6=(char)i;
			 System.out.println("byte= "+i1);
			 System.out.println("short= "+i2);
			 System.out.println("long= "+i3);
			 System.out.println("float= "+i4);
			 System.out.println("double= "+i5);
			 System.out.println("char= "+i6);
			 
			 System.out.println("From long to others\n======================\n");
			 byte l1=(byte)l;
			 short l2=(short)l;
			 int l3=(int)l;
			 float l4=(float)l;
			 double l5=l;
			 char l6=(char)l;
			 System.out.println("byte= "+l1);
			 System.out.println("short= "+l2);
			 System.out.println("int= "+l3);
			 System.out.println("float= "+l4);
			 System.out.println("double= "+l5);
			 System.out.println("char= "+l6);
			 
			 System.out.println("From float to others\n======================\n");
			 byte f1=(byte)f;
			 short f2=(short)f;
			 int f3=(int)f;
			 long f4=(long)f; //Does any decimal value when converted into integer value needs to be explicitly type-casted?
			 double f5=f;
			 char f6=(char)f;
			 System.out.println("byte= "+f1);
			 System.out.println("short= "+f2);
			 System.out.println("int= "+f3);
			 System.out.println("long= "+f4);
			 System.out.println("double= "+f5);
			 System.out.println("char= "+f6);
			 
			 System.out.println("From double to others\n======================\n");
			 byte d1=(byte)d;
			 short d2=(short)d;
			 int d3=(int)d;
			 long d4=(long)d;
			 float d5=(float)d;
			 char d6=(char)d;
			 System.out.println("byte= "+d1);
			 System.out.println("short= "+d2);
			 System.out.println("int= "+d3);
			 System.out.println("long= "+d4);
			 System.out.println("float= "+d5);
			 System.out.println("char= "+d6);
			 
			 System.out.println("From char to others\n======================\n");
			 byte c1=(byte)c;
			 short c2=(short)c;
			 int c3=c;
			 long c4=c;
			 float c5=c;
			 double c6=c;
			 System.out.println("byte= "+c1);
			 System.out.println("short= "+c2);
			 System.out.println("int= "+c3);
			 System.out.println("long= "+c4);
			 System.out.println("float= "+c5);
			 System.out.println("double= "+c6);
			 
	}
	
	
	
}
