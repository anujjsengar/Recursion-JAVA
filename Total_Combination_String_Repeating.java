package Recurssion_New;

public class Total_Combination_String_Repeating {
	public static void combination(String str,int size,String ans) {
		if(ans.length()==size ){
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			combination(str,size,ans+str.charAt(i));
		}
	}
	public static void main(String args[]) {
		combination("abc",2,"");
	}
	/*
	 * Where str is the string that include the char need to include
	 * size is the size of required result
	 * ans is temproary variable;
	 */

}
