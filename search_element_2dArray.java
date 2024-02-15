package Recurssion_2D_Array;
import java.util.*;
public class search_element_2dArray {
	public static ArrayList<Integer> index(int arr[][],int target,int i,int j,ArrayList<Integer> list) {
		if(arr[i][j]==target) {
			list.add(i);
			list.add(j);
			return list;
	}
		if(j==arr[0].length-1 && i<arr.length-1) {
			return index(arr,target,i+1,0,list);
		}
		if(j<arr[0].length-1) {
			return index(arr,target,i,j+1,list);
		}
		return list;
}
	public static void main(String args[]) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer> list=new ArrayList();
		list=index(arr,6,0,0,list);
		System.out.println(list);
	}
}
