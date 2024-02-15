package Recurssion_New;

public class Binary_String_PAYTM {
	public static void	Binary(int n,int i,String ans) {
		if(i==n) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0){
				Binary(n,i+1,ans+"0");
				Binary(n,i+1,ans+"1");
		}
		else {
			if(ans.charAt(i-1)!='1') {
				Binary(n,i+1,ans+"0");
				Binary(n,i+1,ans+"1");
		}
		else {
			Binary(n,i+1,ans+"0");
		}
	}
	}
	public static void main(String args[]) {
		Binary(5,0,"");
	}

}
