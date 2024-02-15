package Recurssion_New;

public class RemoveDuplicatesString {
	public static void Remove(String str,int i,String ans) {
		if(i==str.length()) {
			System.out.println(ans);
			return ;
		}
		if(ans.indexOf(str.charAt(i))==-1) {
			ans=ans+str.charAt(i);
		}
		Remove(str,i+1,ans);
	}
	public static void main(String args[]) {
		String str="AnujKumarAnujKumarAnujKumarAnujKumarAnujKumar";
		Remove(str,0,"");
	}

}
