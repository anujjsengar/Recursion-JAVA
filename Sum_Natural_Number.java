package Recurssion;
//Program to find sum of n natural Number;
public class sum_natural_Number {
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n+sum(n-1);
	}
	public static void main(String args[]) {
		System.out.println(sum(1021));
	}

}
