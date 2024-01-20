package Recurssion;
import java.util.*;
public class Array_List_index_2 {
	public static ArrayList<Integer> index_find(int arr[],int target,int i){
		ArrayList<Integer> list=new ArrayList();
		if(i==arr.length) {
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		ArrayList<Integer> nums=index_find(arr,target,i+1);
		list.addAll(nums);
		return list;	
	}
	public static void main(String args[]){
		int[] arr= {1,2,3,4,5,6,7,5,2,8,9,5};
		ArrayList<Integer> list=new ArrayList();
		list=index_find(arr,5,0);
		System.out.println(list);
	}

}
