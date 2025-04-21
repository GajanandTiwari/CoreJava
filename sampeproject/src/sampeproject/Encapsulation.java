package sampeproject;

class enc 
{
	int y=7;
	public void sri()
	{
		y--;
		System.out.println("the updated value is "+y);
		
	}
	}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
enc x=new enc();
System.out.println(x.y);
x.sri();
	}

}
