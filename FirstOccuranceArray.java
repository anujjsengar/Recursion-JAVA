package Recurssion_New;

public class FirstOccuranceArray {
	public static int Find(int arr[],int target,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==target) {
			return i;
		}
		return Find(arr,target,i+1);
		}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Find(arr,45,0));
	}

}
