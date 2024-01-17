package Recurssion;

public class ClimbStair {
	public static void stair(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
			}
		if(n<0) {
			return;
		}
		stair(n-1,ans+1);
		stair(n-2,ans+2);
		stair(n-3,ans+3);
	}
	public static void main(String args[]) {
		stair(4,"");
	}
	

}
