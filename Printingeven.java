
public class Printingeven
{
  public void even(String s)
  {
    String[] word=s.split(" "); //Spliting every word till Space("space");

    int[] wordsLength=new int [word.length];//Int type of array which give length int[] wordsLength=> 7

    for(int i=0;i<=word.length-1;i++)
    {
        wordsLength[i]=word[i].length();
           //[Christopher , Nolan , is , the , director , of , Oppenheimer] =>string type of aaray
                //[11          ,5      , 2  , 3   , 8        , 2  ,  11 ] => integer type of array
    }
    for (int i=0;i<=word.length-1;i++)
    {
        if(wordsLength[i]%2==0)
        {
            System.out.println("-----------");
            System.out.println(word[i]+" : "+wordsLength[i]);
        }
    }


  }

  public static void main(String[] args) 
  {
    String s="Christopher Nolan is the director of Oppenheimer";
    Printingeven aobj=new Printingeven();
    aobj.even(s);
  }
}