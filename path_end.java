package Recurssion_2D_Array;

public class path_end {
	public static void path(int arr[][],int i,int j,String ans) {
		if(arr.length==i+1 && arr[0].length==j+1) {
			ans=ans+arr[i][j];
			System.out.println(ans);
			return;
		}
		if(i==arr.length || j==arr[0].length) {
			return;
		}		
		path(arr,i+1,j,ans+arr[i][j]);
		path(arr,i,j+1,ans+arr[i][j]);
	}
	public static void main(String args[]) {
		int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
		path(arr,0,0,"");
	}
}
