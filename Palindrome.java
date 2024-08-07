public class Palindrome
{
	void pal(String s)
	{
		String rev="";
		String temp=s;

		for (int i=s.length()-1;i>=0;i--)
		{

			rev=rev+s.charAt(i);
			//4=>n,3=>i,2=>t,1=>i,0=>n
		}
 

		if(temp.equals(rev)) //(temp==rev)
		{
			System.out.println(temp+" is palindrome String");
			// System.err.println(rev.length());
		}
		else
		{
			System.out.println(temp+ " is not a palindrome String");
		}

		System.out.println("---------------------");
		System.out.println(temp==rev);
	}


	public static void main(String[] args) 
	{	
		Palindrome obj=new Palindrome();

		String s="nitin";

		obj.pal(s);
		
	}




}