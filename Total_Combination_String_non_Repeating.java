package Recurssion_New;

public class Total_Combination_String_non_Repeating {
	public static void non_repeat_combination(String str,int size,String ans) {
		if(ans.length()==size) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++){
			if(ans.indexOf(str.charAt(i))==-1) {
				non_repeat_combination(str,size,ans+str.charAt(i));
			}
		}
	}
	public static void main(String args[]) {
		non_repeat_combination("abcd",3,"");
	}

}
