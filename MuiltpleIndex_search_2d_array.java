package Recurssion_2D_Array;
import java.util.*;
public class MuiltpleIndex_search_2d_array {
	public static ArrayList<Integer> FindIndex(int arr[][],int target,int i,int j,ArrayList<Integer> temp,ArrayList<Integer> list){
		if(arr[i][j]==target) {
			temp.add(i);
			temp.add(j);
			list.addAll(temp);
			temp.clear();
			if(i==arr.length-1&& j==arr[0].length) {
				return list;
			}
		}
		if(j==arr[0].length-1 && i<arr.length-1) {
			return FindIndex(arr,target,i+1,0,temp,list);
		}
		if(j<arr[0].length) {
			return FindIndex(arr,target,i,j+1,temp,list);
		}
		return list;
		
	}
	public static void main(String args[]) {
		int [][] arr= {{1,2,3},{3,4,5}};
		ArrayList<Integer> temp=new ArrayList();
		ArrayList<Integer> list=new ArrayList();
		System.out.println(FindIndex(arr,3,0,0,temp,list));
		
	}
}
