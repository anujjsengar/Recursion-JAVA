package Recurssion;
//Substring of 3 length string
public class Substring {
	public static void substr(String n,String ans) {
		if(n.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=n.charAt(0);
		substr(n.substring(1),ans);
		substr(n.substring(1),ans+ch);
		 
	}
	public static void main(String args[] ){
		substr("abc","");
	}

}
