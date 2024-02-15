package Recurssion_New;

public class NaturalNumberSum {
	public static int NaturalSum(int n) {
		if(n==0) {
			return 0;
		}
		return n+NaturalSum(n-1);
	}
	public static void main(String args[]) {
		System.out.println(NaturalSum(10));
	}
	

}
