
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
	StringBuffer str=new StringBuffer(s);
		String del="";
		for(int i=0;i<=str.length();i++)
		{
			if(i%2==1)
			{
				continue;
				
			}
			del =del+str.charAt(i);
		}
		System.out.println(del);
	}
	}


