package Recurssion_2D_Array;

public class GP_Series {
	public static void Series(int a,int n,int r,int x) {
		if(n==0) {
			return ;
		}
		System.out.print(a*(int)Math.pow(r, x)+" ");
		Series(a,n-1,r,x+1);
	}
	public static void main(String args[]) {
		Series(8,10,5,0);
	}
}
