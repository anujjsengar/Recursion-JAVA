package Recurssion_2D_Array;

public class nCr {
	public static void main(String args[]) {
		int n=25;
		int r=20;
		System.out.println(Comb(n,r));
	}
	private static int Comb(int n, int r) {
		if((n==1 && r==0)||(n==1 && r==1)||(n==r)) {
			return 1;
		}
		if(r==1) {
			return n;
		}
		return Comb(n-1,r-1)+Comb(n-1,r);
	}
}
