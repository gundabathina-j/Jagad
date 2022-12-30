
public class Deleteoddindex {
	static String removeOddIndexCharacters(String str) {
	//String  s="Welcome";
	String del="";
	for(int i=0;i<=str.length();i++)
	{
		if(i%2==1)
		{
			continue;
			
		}
		del +=str.charAt(i);
	}
	return del;
}



	public static void main(String[] args)
	{
	String s="Welcome";
	s=removeOddIndexCharacters(s);
	System.out.println(s);
}
}
