package sampeproject;
class CONST
{
public CONST()

{
System.out.println("the first method has been executed");	
}

}
class STRUCTOR extends CONST
{
public STRUCTOR(int b)
{
	super();
System.out.println("The second method has been executed");
}
}
public class SUPERforCONSTRUCTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
STRUCTOR obj=new STRUCTOR(9);
	}

}
