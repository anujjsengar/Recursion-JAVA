package Recurssion_New;

public class PowFunctionlogn {
	public static int Pow(int x,int n) {
		if(n==0) {
			return 1;
		}
		int ls=Pow(x,n/2)*Pow(x,n/2);
		if(n%2!=0) {
			ls=x*ls;
		}
		return ls;
	}
	public static void main(String args[]) {
		System.out.println(Pow(2,3));
	}

}
