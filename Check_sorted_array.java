package Recurssion;

public class check_sorted_array {
	public static boolean sorted(int[]arr,int i) {
		if(arr[i]>arr[i+1]) {
			return false;
		}
		if(i==arr.length-2) {
			return true;
		}
		return sorted(arr,i+1);
	}
	public static void main(String args[]) {
		int [] nums= {1,2,3,4,5,6,7,11,5,2};
		System.out.println(sorted(nums,0));
	}

}
