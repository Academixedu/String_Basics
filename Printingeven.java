public class Printingeven
{
		void meth1(String s)
		{
			String [] word=s.split(" "); //splitting every word By "_"(space)	

			int [] wordsLength= new int [word.length];
			//

			for (int i=0;i<=word.length-1;i++)
			{
				wordsLength[i]=word[i].length(); 
				//[Christopher , Nolan , is , the , director , of , Oppenheimer] =>string type of aaray
				//[11          ,5      , 2  , 3   , 8        , 2  ,  11 ] => integer type of array
			}

			for (int i=0;i<=word.length-1;i++)
			{
				if (wordsLength[i]%2==0)
				{
				//	System.out.println(word[i] +" : "+word[i].length());
					System.out.println(word[i] +" : "+wordsLength[i]);
				}
			}
		}


	public static void main(String[] args) 
	{
		String s="Christopher Nolan is the director of Oppenheimer";


		Printingeven obj=new Printingeven();
		obj.meth1(s);
	}
}