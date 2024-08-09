public class Palindrome
{
    public void pal(String word)
      {
        String rev="";//Empty String
        
        String temp=word;//SOS=SOS
      
        for(int i=word.length()-1;i>=0;i--)
        {
          rev=rev+word.charAt(i);
          //4=>n  ,  3=>ni  ,  2=>nit  ,  1=>niti  ,  0=>nitin
        }
        if(temp.equals(rev))
        {
          System.out.println("-------------------------------");
          System.out.println(temp+" is a PALINDROME Number ");
          
        }
        else
        {
          System.out.println(temp+" is not a PALINDROME Number");
        }

    }
    public static void main(String[] args) 
    {
      Palindrome aobj=new Palindrome();
      aobj.pal("NitiN");    
    }
}