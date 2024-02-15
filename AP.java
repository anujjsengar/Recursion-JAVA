package Recurssion_2D_Array;

public class GP {
	public static void Series(int a,int n,int x) {
		if(n==0) {
			return ;
		}
		System.out.print(a*(int)Math.pow(n, x-1)+" ");
		Series(a,n-1,x-1);
	}
	public static void main(String args[]) {
		Series(1,10,5);
	}

}
