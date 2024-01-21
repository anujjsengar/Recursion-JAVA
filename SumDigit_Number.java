package Recurssion;
//Porgram to find the sum of digit of number using recursion
public class SumDigit {
	public static int sum(int n) {
		if(n/10==0) {
			return n;
		}
		return (n%10)+sum(n/10);
	}
	public static void main(String args[]) {
		System.out.println(sum(1534));
	}
}
