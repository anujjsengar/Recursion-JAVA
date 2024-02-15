package Recurssion_New;

public class NumberToString {
	public static void convert(int n,String arr[],String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		ans=" "+arr[n%10]+ans;
		convert(n/10,arr,ans);
	}
	public static void main(String args[]) {
		String arr[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		convert(9999,arr,"");
	}
}
