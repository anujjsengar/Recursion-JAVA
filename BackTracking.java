package Recurssion_2D_Array;

public class BackTracking {
	public static int minspeed(int arr[],int h) {
		int left=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
		}
	}
	
}
