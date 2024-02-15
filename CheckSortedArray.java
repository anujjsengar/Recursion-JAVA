package Recurssion_New;

public class CheckSortedArray {
	public static boolean SortedCheck(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return SortedCheck(arr,i+1);
	}
	public static void main(String args[]) {
		int [] arr= {1,2,3,4,0};
		System.out.println(SortedCheck(arr,0));
	}

}
