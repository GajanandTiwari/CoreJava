import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);


System.out.println("Enter the string:");
String s=sc.nextLine();
int i=0;
int j=s.length()-1;
boolean flag=true;
while(i<=j)
{
if(s.charAt(i)!=s.charAt(j))
{
flag=false;
break;
}
i++;
j--;
}
if(flag) System.out.println("yes");
else System.out.println("no");

	}

}
