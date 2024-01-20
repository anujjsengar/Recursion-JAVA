package Recurssion;

public class linear_search {
	public static int linear(int[] nums,int n,int i) {
		if(i==nums.length) {
			return -1;
		}
		if(nums[i]==n) {
			return i;
		}
		return linear(nums,n,i+1);
	}
	public static void main(String args[]) {
		int[] arr= {1,3,2,5,6};
		System.out.println(linear(arr,4,0));
	}
}
