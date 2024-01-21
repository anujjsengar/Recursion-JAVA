package Recurssion;

public class pyramid_pattern {
	public static void pattern(int n) {
		if(n==0) {
			return;
		}
		for(int i=0;i<n;i++)
		System.out.print("*");
		System.out.println();
		pattern(n-1);
	}
	public static void main(String args[]) {
		pattern(5);
	}

}
