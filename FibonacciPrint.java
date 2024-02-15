package Recurssion_New;

public class FibonacciPrint {
	public static int FiboPrint(int n) {
		if(n==0 || n==1) {
		return n;
	}
		int ls=FiboPrint(n-1)+FiboPrint(n-2);
		return ls;
		
	}
	public static void main(String args[]) {
		System.out.println(FiboPrint(25));;
	}

}
