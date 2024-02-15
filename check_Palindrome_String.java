package Recurssion_2D_Array;

public class check_Palindrome_String {
	public static void main(String args[]) {
		String str="malayalam";
		check(str,"",str.length()-1);
	}
	private static void check(String str,String ans,int i) {
		if(ans.length()==str.length()) {
			if(ans.indexOf(str)==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			return ;
		}
		check(str,ans+str.charAt(i),i-1);
	}
}
