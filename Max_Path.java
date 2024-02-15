package Recurssion_2D_Array;
public class Max_Path {
	public static int max(int arr[][],int i,int j,int s,int sum) {
		if(i==arr.length-1& j==arr[0].length-1) {
			s=s+arr[i][j];
			if(sum<s) {
				sum=s;
			}
			
			return sum;
		}
		if(i<arr.length-1) {
			s=s+arr[i][j];
			return max(arr,i+1,j,s,sum);
		}
		if(j<arr[0].length-1) {
		s=s+arr[i][j];
		return max(arr,i,j+1,s,sum);
	}
		return sum;
	}
	public static void main(String args[]) {
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int x=max(arr,0,0,0,0);
		System.out.println(x);
		
	}

}
