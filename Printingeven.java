
public class Printingeven {
public void dynamic(String s) {
	//Splitting
	String []words=s.split(" ");
	//Feeding Each word into one Array	
	int[]wordsLength=new int[words.length];
	
	for(int i=0;i<words.length;i++) {
		wordsLength[i]=words[i].length();
	}
	for(int i=0;i<words.length;i++) {
		if(wordsLength[i]%2==0) {
			System.out.println(words[i]+" "+words[i].length());
		}
	}
}
public void statical(String s) {
	for(String word:s.split(" ")) {
		if(word.length()%2==0) {
			System.out.println(word+" "+word.length());
		}
	}
}
	
	public static void main(String[] args) {
	System.out.println("Even Length words");
	String s="Oppenhimmer introduced Atomic Bomb";
   Printingeven p=new Printingeven();
   p.dynamic(s);
}
}
