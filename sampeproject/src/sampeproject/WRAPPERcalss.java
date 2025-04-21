package sampeproject;

public class WRAPPERcalss {
public static void main(String[] args) {
	int a=9; int b;
	Integer obj=new Integer(a); //autoboxing
	System.out.println(obj);
	b=obj;  //unboxing
	b--;
	System.out.println(b);
	boolean a1=true; boolean a2;
	Boolean obj0=new Boolean(a1);
	System.out.println(obj0);
	a2=obj0;
	System.out.println(a2);
	char c1='m'; char c2;
	Character obj1=new Character(c1);
	System.out.println(obj1);
	c2=obj1;
	System.out.println(c2);
	byte b1=3;byte b2;
	short s1=66;short s2;
	Short obj2=new Short(s1);
	System.out.println(obj2);
	s2=obj2;
	System.out.println(s2);
	long l1=3679;long l2;
	Long obj3=new Long(l1);
	System.out.println(obj3);
	l2=obj3;
	System.out.println(l2);
	float f1=3.7f;float f2;
	Float obj4=new Float(f1);
	System.out.println(obj4);
	f2=obj4;
	System.out.println(f2);
	double d1=3.6918;double d2;
	Double obj5=new Double(d1);
	System.out.println(obj5);
	d2=obj5;
	System.out.println(d2);
	
}
}

