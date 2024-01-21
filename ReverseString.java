package Recurssion;
//Program to find Reverse of a String
public class String_Reverse {
	public static void revstr(String s,int n) {
		if(n==0) {
			return;
		}
		System.out.print(s.charAt(n-1));
		revstr(s,n-1);
	}
	public static void main(String args[]) {
		String s="Anuj Sengar";
		revstr(s,s.length());
	}
}
