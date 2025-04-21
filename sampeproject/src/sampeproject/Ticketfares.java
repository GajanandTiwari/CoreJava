package sampeproject;

public class Ticketfares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=300;
		int ag = 30;
		int sr=(300/100 *80);

		if(ag<=5)
		{

		System.out.println(" no fare as your are a child as your age is "+ag);
		}
		else if((ag>=5)&&(ag<=12))
		{

		System.out.println("as you are a minor so your ticket fare is "+T/2 +" as your age is "+ag);
		}
		else if((ag>=13)&&(ag<=60))
		{
		System.out.println("you are a mojor so your ticket fare is"+T +" as your age is "+ag);
		}
		else
		{
		System.out.println("you are senior citizen consession 20% is given so yor ticket fare is "+sr +" as your age is "+ag );
		}

	}
}
	



