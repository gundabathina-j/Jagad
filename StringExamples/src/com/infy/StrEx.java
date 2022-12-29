package com.infy;

public class StrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="Welcome";
		String b="Welcome";
		String rev="";
		String c=new String("Welcom");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b==c);
		
		System.out.println(a.equals(c));
		System.out.println(b.equals(a));
		System.out.println(c.equals(a));
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);

	}

}
