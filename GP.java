package Recurssion_2D_Array;

public class AP {
	public static void Series(int n,int x) {
		if(n==0) {
			return ;
		}
		System.out.print(n*x+" ");
		Series(n-1,x);
	}
	public static void main(String args[]) {
		Series(10,5);
	}

}
