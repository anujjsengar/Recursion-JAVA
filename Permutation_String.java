package Recurssion_2D_Array;

public class Permutation_String {
	public static void main(String args[]) {
		String str="ABC";
		permut(str,"",str.length());
	}
	public static void permut(String str,String ans,int size) {
		if(ans.length()==size) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			permut(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i),size);
		}
	}
}
