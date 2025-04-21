package sampeproject;
class SUPER
{
	int x=9;
	public void Keyword()
	{
		
		x++;
		System.out.println("Executing first method value, the value is "+x);
		}
}
class var extends SUPER
{
public void KEY()
{

super.Keyword();
System.out.println(super.x);
System.out.println("The second method has been executed");
  
}
}
public class SUPERkeywordforvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var obj=new var();
obj.KEY();
	}

}
