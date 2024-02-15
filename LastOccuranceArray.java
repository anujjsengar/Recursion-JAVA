package Recurssion_New;

public class LastOccuranceArray {
	public static int FindLast(int[] arr,int target,int i) {
		if(i==-1) {
			return -1;
		}
		if(arr[i]==target) {
			return i;
		}
		return FindLast(arr,target,i-1);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,42,2,4,2,4,5};
		System.out.println(FindLast(arr,4,arr.length-1));
		
	}

}
