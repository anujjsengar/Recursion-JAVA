// Program to find possible combination for n time toss
package Recurssion;

public class Toss {
	public static void n_Toss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		n_Toss(n-1,ans+"H");
		n_Toss(n-1,ans+"T");
	}
	public static void main(String args[]) {
		n_Toss(3,"");
	}
}
