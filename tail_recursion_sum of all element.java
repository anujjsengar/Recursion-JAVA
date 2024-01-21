package Recurssion;

public class tail_recursion_sum_all_element_array {
	public static int sum_array(int[] arr,int n) {
		if(n==0) {
			return 0;
		}
		return arr[n-1]+sum_array(arr,n-1);	
	}
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5};
		System.out.println(sum_array(arr,arr.length));
	}
}
