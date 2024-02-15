package Recurssion_2D_Array;

public class path_count {
	public static int count(int arr[][],int i,int j) {
		if(i==arr.length-1& j==arr[0].length-1) {
			return 1;
		}
		if(i==arr.length || j==arr[0].length) {
			return 0;
		}
		int a=count(arr,i+1,j);
		int b=count(arr,i,j+1);
		return a+b;
	}
	public static void main(String args[]) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.print(count(arr,0,0));
	}
}

