package sampeproject;
class speed
{
public int CaughtSpeeding (int x,boolean y)
{
if(y==false)
{
if(x<=60)
{
return 0;	
}
else if(x>60&&x<=80)
{
return 1;	
}
else 
{
return 2;	
}
}
else
{
if(x<=65)
{
return 0;	
}
else if(x>65&&x<85)
{
return 1;	
}
else
{
return 2;	
}
}
}
}

public class speedingissue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
speed obj = new speed();
int y=obj.CaughtSpeeding(85,false);
System.out.println(y);
	}

}
